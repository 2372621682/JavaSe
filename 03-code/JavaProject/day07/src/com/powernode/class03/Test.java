package com.powernode.class03;

class Teacher{
    //属性：实例变量，属性对象的变量
    String name = "zs";
    int age;
    char sex;
}
public class Test {
    public static void main(String[] args) {
        /**
         * 1.创建对象
         *    语法: 类名称  对象名称 = new 类名称();
         *         1.类名称:创建哪个类的对象使用哪个类的名称
         *         2.对象名称，可以理解为变量名称，可以自定义
         * 2.对象访问实例变量
         *      对象名称.实例变量名称
         */
        //类名称  对象名称 = new 类名称();
        Teacher teacher = new Teacher();
        //对象名称.实例变量名称
        System.out.println(teacher.name);//zs
        String sname = teacher.name;//拿到name命名空间中的值，赋值给sname
        System.out.println(sname);
        //变量：先声明，后赋值，再使用？age和sex为什么没报错呢
        System.out.println(teacher.age);
        System.out.println(teacher.sex);
    }
}
