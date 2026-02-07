package com.powernode.extends15;

public class Person {
    public String name = "父类name";
}
class Teacher extends  Person{
    public String name = "子类name";
}
class Test{
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println(teacher.name);
    }
}
