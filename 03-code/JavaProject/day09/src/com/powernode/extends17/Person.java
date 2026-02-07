package com.powernode.extends17;

public class Person {
    public Person(){
        System.out.println("Person.Person");
    }
}
class Teacher extends Person{
    int age;

    /**
     * 1.构造器的第一行如果有this调用重载构造器
     * 2.那么编译器不会添加super(),调用父类构造器
     * 3.构造器的第一行如果没有this调用了重载构造器
     * 4.那么编译器会添加super(),调用父类构造器
     */
    Teacher(){
        this(20);
    }
    Teacher(int age){
        //super();
        this.age = age;
    }
}
class Test{
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
    }
}