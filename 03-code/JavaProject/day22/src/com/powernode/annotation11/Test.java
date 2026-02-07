package com.powernode.annotation11;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
// 测试类，主要用于演示通过反射结合自定义注解来动态生成查询SQL语句的功能
public class Test {
    public static void main(String[] args) {
        // 创建一个Person对象，并设置其属性值
        Person p = new Person();
        p.setName("wanglu");
        p.setAge(25);
        p.setId(1001);
        p.setSex("男");



        String querySQL = null;
        try {
            // 调用query方法尝试生成查询该Person对象对应的SQL语句，捕获可能出现的异常
            querySQL = query(p);
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
                 | InvocationTargetException e) {
            e.printStackTrace();
        }
        // 输出生成的查询SQL语句，如果生成过程出现异常则输出异常信息
        System.out.println(querySQL);
    }

    private static String query(Object p) throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        StringBuilder str = new StringBuilder();

        // 通过反射获取传入对象的Class对象，后续将基于这个Class对象来获取相关注解信息等
        Class<? extends Object> obj = p.getClass();

        // 判断该对象的类上是否存在 @Table 注解，若不存在则无法生成对应的SQL语句，直接返回null
        boolean isExistsTable = obj.isAnnotationPresent(Table.class);
        if (!isExistsTable) {
            return null;
        }

        // 获取对象所属类上的 @Table 注解实例，并从中获取表名（假设 @Table 注解有一个value属性用于指定表名）
        Table table = (Table) obj.getAnnotation(Table.class);
        String tableName = table.value();

        // 开始拼装SQL语句的基础部分，这里先写 "select * from [表名] where 1=1 "，后续会根据条件拼接更多的查询条件
        str.append("select * from ").append(tableName).append(" where 1=1 ");

        // 获取该对象所属类的所有成员变量（也就是类中的属性），通过遍历这些成员变量来处理每个属性对应的注解及取值情况
        Field[] fields = obj.getDeclaredFields();
        for (Field field : fields) {
            // 判断当前成员变量上是否存在 @Column 注解，如果不存在则跳过该成员变量，不将其加入查询条件中
            Boolean isExistColumn = field.isAnnotationPresent(Column.class);
            if (!isExistColumn) {
                continue;
            }

            // 获取当前成员变量上的 @Column 注解实例，并从中获取对应的列名（假设 @Column 注解有一个value属性用于指定列名）
            Column column = field.getAnnotation(Column.class);
            String columnName = column.value();

            // 根据成员变量对应的列名来构建其对应的get方法名，遵循JavaBean的命名规范（例如属性名为 "name"，则get方法名为 "getName"）
            String methodName = "get" + columnName.substring(0, 1).toUpperCase() + columnName.substring(1);

            // 通过反射获取对象所属类中定义的上述构建好的get方法（可能会抛出 NoSuchMethodException 异常，如果方法不存在的话）
            Method method = obj.getMethod(methodName);

            // 通过反射执行获取到的get方法，传入对象本身作为参数，获取该成员变量的值（可能会抛出 IllegalAccessException、InvocationTargetException 等异常）
            Object value = method.invoke(p);

            // 过滤掉成员变量中的null值以及值为0的整数类型情况，因为这些情况通常不适合作为查询条件加入到SQL语句中，直接跳过继续处理下一个成员变量
            if (null == value || (value instanceof Integer && (Integer) value == 0)) {
                continue;
            }

            // 将符合条件的成员变量对应的列名和值拼接成查询条件，添加到SQL语句中，格式为 " and [列名]=[值]"
            str.append(" and ").append(columnName).append("=").append(value);
        }

        // 返回最终拼装好的查询SQL语句
        return str.toString();
    }
}