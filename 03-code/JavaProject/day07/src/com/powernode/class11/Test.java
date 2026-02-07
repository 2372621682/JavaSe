package com.powernode.class11;

class Teacher{
    String name = "zs";
    int age = 23;

}
public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        System.out.println("t1.name = " + t1.name);//zs
        System.out.println("t1.age = " + t1.age);//23
        changeObject(t1);
        System.out.println("t1.name = " + t1.name);//ls
        System.out.println("t1.age = " + t1.age);//33
    }

    public static void changeObject(Teacher teacher) {
        System.out.println("teacher.name = " + teacher.name);//zs
        System.out.println("teacher.age = " + teacher.age);//23
        teacher.name = "ls";
        teacher.age = 33;
    }
}
