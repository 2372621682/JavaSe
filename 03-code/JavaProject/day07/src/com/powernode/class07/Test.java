package com.powernode.class07;

class Teacher{
    String name = "zs";
    int age = 23;
}
public class Test {
    public static void main(String[] args) {
        //需求：访问name并输出
        //第一种方案：
        Teacher teacher = new Teacher();
        System.out.println(teacher.name);
        System.out.println(teacher.age);

        //第二种方案
        System.out.println(new Teacher().name);
        //System.out.println(new Teacher().age);
        /**
         * 两种方案的区别：
         *   第一种方案：
         *      1.更加灵活，对象可以多次使用
         *      2.内存利用率：对象占用内存过长
         *   第二中方案：
         *      1.不灵活，只能使用一次
         *      2.内存利用率：对象占用内存较短
         */

    }
}
