package com.powernode.extends11;

public class Person {
    public String name = "zs";
    public int age = 23;
    public char sex = '男';

    public void eat(){
        System.out.println("Teacher.eat");
    }
    public void sleep(){
        System.out.println("Teacher.sleep");
    }
}
//Teacher 继承了 Person，那么Teacher就拥有了Person的公有属性和方法
class Teacher extends  Person{
    public String department = "讲师编号";

    public void lecture(){
        System.out.println("Teacher.lecture");
    }
}
class Student extends Person{

    public String className = "班级名称";
}
class Test{
    public static void main(String[] args) {
        //1.使用子类继承下来的属性
        Teacher t1 = new Teacher();
        System.out.println(t1.name);
        System.out.println(t1.age);
        System.out.println(t1.sex);
        //2.使用子类继承下来的方法
        t1.sleep();
        t1.eat();
        //3.访问自己的属性和方法
        System.out.println(t1.department);
        t1.lecture();

    }
}
