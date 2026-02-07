package com.powernode.polymorphic23;

public class Animal {
    private String name;
    private int age;

    public void sleep(){
        System.out.println("Animal.sleep");
    }
}
class Cat extends Animal{
    private int cno;

    @Override
    public void sleep() {
        System.out.println("Cat.sleep");
    }
}
class Test{
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.sleep();
    }
}