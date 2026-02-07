package com.powernode.exercise04;

class Person{
    public void eat(){
        System.out.println("Person.eat");
    }
}
class Student extends Person{

    @Override
    public void eat() {
        System.out.println("Student.eat");
    }

    public void swim(){
        System.out.println("Student.swim");
    }
}
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();//Person.eat

        Student student = new Student();
        student.eat();
        student.swim();

        Person ps = new Student();
        ps.eat();//子类的
        //ps.swim();

    }
}
