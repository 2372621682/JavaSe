package com.powernode.extends10;

public class Person {
    public String name;
    public int age;
    public char sex;

    public void eat(){
        System.out.println("Teacher.eat");
    }
    public void sleep(){
        System.out.println("Teacher.sleep");
    }
}
//Teacher 继承了 Person，那么Teacher就拥有了Person的公有属性和方法
class Teacher extends  Person{
    public String department;

    public void lecture(){
        System.out.println("Teacher.lecture");
    }
}
class Student extends Person{

    public String className;


}
