package com.powernode.exercise01;

class Animal{
    public String name;
    public int age;

    public String getDetails(){
        return "姓名：" + name + "\t年龄：" + age;
    }
}

class Fish extends Animal{
    public int scale;

    public void swim(){
        System.out.println("Fish.swim");
    }
}
class Cat extends Animal{
    public String hairColor;
    public void catchMouse(){
        System.out.println("Cat.catchMouse");
    }
}

public class Test {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Cat cat = new Cat();

        System.out.println(fish.scale);
        fish.swim();
        System.out.println(fish.name);
        System.out.println(fish.age);
        System.out.println(fish.getDetails());

        System.out.println(cat.hairColor);
        cat.catchMouse();
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.getDetails());
    }
}
