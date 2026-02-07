package com.powernode.polymorphic10;

import javax.swing.*;

class Person{
    public void eat(){
        System.out.println("Person.eat");
    }
    public void sleep(){
        System.out.println("Person.sleep");
    }
}
class Student extends Person{
    @Override
    public void eat() {
        System.out.println("Student.eat");
    }

    @Override
    public void sleep() {
        System.out.println("Student.sleep");
    }
    public void doHomeWork(){
        System.out.println("Student.doHomeWork");
    }
}
class Teacher extends Person{
    @Override
    public void eat() {
        System.out.println("Teacher.eat");
    }

    @Override
    public void sleep() {
        System.out.println("Teacher.sleep");
    }
    public void lecture(){
        System.out.println("Teacher.lecture");
    }
}
public class Test {
    public static void main(String[] args) {
        Person ps = new Student();
        method(ps);
        Person pt = new Teacher();
        method(pt);
    }

    public static void method(Person person) {
        person.eat();
        person.sleep();
        if (person instanceof Student) {
            Student student = (Student) person;
            student.doHomeWork();
        }else if(person instanceof Teacher){
            Teacher teacher = (Teacher) person;
            teacher.lecture();
        }

    }
}
