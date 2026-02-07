package com.powernode.polymorphic09;

public class Animal {
    public String name = "Animal.name";
    public int age = 2;

    public void eat(){
        System.out.println("Animal.eat");
    }
}
class Cat extends Animal{
    public String name = "Cat.name";

    @Override
    public void eat() {
        System.out.println("Cat.eat");
    }
}
class Test{
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();//子类的
        System.out.println(animal.name);//父类的

        /**
         * 1.Java中的多态，指的是方法多态
         * 2.属性和方法的调用规则：
         *    1.属性:编译看父类，运行看父类
         *    2.方法：编译看父类，运行看子类
         */

    }
}
