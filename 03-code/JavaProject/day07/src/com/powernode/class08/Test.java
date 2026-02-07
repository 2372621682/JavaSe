package com.powernode.class08;
class Student{
    String name = "zs";
    int age = 23;
}
public class Test {
    public static void main(String[] args) {
        //类名称  对象名称 = new 类名称();
        Student student = new Student();
        student.name = "ls";
        student.age = 33;
        System.out.println(student.name);
        System.out.println(student.age);
    }
}
