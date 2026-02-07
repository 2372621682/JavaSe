package com.powernode.exercise02;

class Animal{
    public String name;
    public int age;

    public void eat(){
        System.out.println("Animal.eat");
    }

    public String getDetails(){
        return "姓名：" + name + "\t年龄：" + age;
    }
}

class Fish extends Animal{
    public int scale;

    @Override
    public void eat() {
        System.out.println("Fish.eat小虾");
    }

    public void swim(){
        System.out.println("Fish.swim");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\t鳞片：" + scale;
    }
}
class Cat extends Animal{
    public String hairColor;

    @Override
    public void eat() {
        System.out.println("Cat.eat鱼");
    }

    public void catchMouse(){
        System.out.println("Cat.catchMouse");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\t毛的颜色：" + hairColor;
    }
}

public class Test {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Cat cat = new Cat();

        fish.eat();
        System.out.println(fish.getDetails());

        cat.eat();
        System.out.println(cat.getDetails());
    }
}
