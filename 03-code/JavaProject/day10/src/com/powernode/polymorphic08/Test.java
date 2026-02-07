package com.powernode.polymorphic08;

class Animal{
   private String name;
   private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Cat extends Animal{
    private String hireColor;

    public Cat(String name, int age, String hireColor) {
        super(name, age);
        this.hireColor = hireColor;
    }
}
public class Test {
    public static void main(String[] args) {
        Animal ac = new Cat("喵喵",2,"red");
        method(ac);
    }
    public static void method(Animal animal){
        if (animal instanceof Cat) {//判断animal是否指向Cat对象，如果指向返回true，否则返回false
            Cat cat = (Cat) animal;
            System.out.println(cat);
        }
    }
}
