package com.powernode.reflection07;

import java.lang.reflect.Field;

class Teacher{
    public String name = "zs";
    private int age = 23;
    public static String city = "北京";
}
public class Test {
    public static void main(String[] args) throws Exception {
        /**
         * - 字段
         *   1.修饰符
         *   2.数据类型
         *   3.字段名称
         *   4.值
         *     1.取值
         *     2.赋值
         */
        //1.获得字节码文件对象
        Class<?> aClass = Class.forName("com.powernode.reflection07.Teacher");
        System.out.println("=========实例字段---取值和赋值===========");
        //1.通过字段名称获得字段对象
        Field name = aClass.getField("name");
        //2.创建对象
        Object teacher = aClass.newInstance();
        //3.取值
        System.out.println(name.get(teacher));
        //4.赋值
        name.set(teacher,"ls");
        System.out.println(name.get(teacher));
        //5.私有字段的值
        //5.1获得私有字段对象
        Field age = aClass.getDeclaredField("age");
        //5.2设置访问权限
        age.setAccessible(true);
        //5.3取值
        System.out.println(age.get(teacher));
        //5.4赋值（修改值）
        age.set(teacher,33);
        System.out.println(age.get(teacher));
        System.out.println("=========静态字段---取值和赋值===========");
        //1.获得静态字段对象
        Field city = aClass.getField("city");
        //2.获得值
        System.out.println(city.get(null));
        //3.赋值
        city.set(null,"南京");
        System.out.println(city.get(null));

    }
}
