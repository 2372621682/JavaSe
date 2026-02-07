package com.powernode.reflection06;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

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
        Class<?> aClass = Class.forName("com.powernode.reflection06.Teacher");
        //2.通过字节码文件对象获得字段数组
        //Field[] fields = aClass.getFields();//只能获得public修饰的字段
        Field[] declaredFields = aClass.getDeclaredFields();//获得所有的字段对象
        for (Field field : declaredFields) {
            //3.获得字段信息
            int modifiers = field.getModifiers();
            System.out.println("修饰符：" + Modifier.toString(modifiers));
            System.out.println("数据类型：" + field.getType());
            System.out.println("字段名称：" + field.getName());
            //4.判断字段是否为私有
            if (Modifier.isPrivate(modifiers)) {
                //如果为私有，设置访问权限为true
                field.setAccessible(true);
            }
            System.out.println("值：" + field.get(aClass.newInstance()));
        }
    }
}
