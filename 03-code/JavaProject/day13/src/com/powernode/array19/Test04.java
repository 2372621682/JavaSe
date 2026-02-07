package com.powernode.array19;
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
public class Test04 {
    public static void main(String[] args) {
        int[] ints = new int[3];
        ints [0] = 1;
        //多态数组
        Animal[] animals = new Dog[3];
        animals[0] = new Dog();
        //ArrayStoreException:数组存储异常
        animals[1] = new Cat();
    }
}
