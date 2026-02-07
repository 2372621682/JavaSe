package com.powernode.class06;

class Teacher{
    String name = "zs";
    int age = 23;
    char sex;

}
public class Test {
    public static void main(String[] args) {
        //类名称 对象名称 = new 类名称()
        Teacher t1  = new Teacher();
        Teacher t2  = new Teacher();

        t1.name = "zs";
        t1.age = 33;
        t1.sex = '女';

        t2.name = "ww";
        t2.age = 43;

        System.out.println("t1.name = " + t1.name);
        System.out.println("t1.age = " + t1.age);
        System.out.println("t1.sex = " + t1.sex);

        System.out.println("t2.name = " + t2.name);
        System.out.println("t2.age = " + t2.age);
        System.out.println("t2.sex = " + t2.sex);
    }
}
