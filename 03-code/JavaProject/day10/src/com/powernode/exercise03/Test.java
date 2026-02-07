package com.powernode.exercise03;

class Animal{
    public String name;
    public int age;

    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("Animal.eat");
    }

    public String getDetails(){
        return "姓名：" + name + "\t年龄：" + age;
    }
}

class Fish extends Animal{
    public int scale;

    Fish(String name,int age,int scale){
        super(name,age);
        this.scale = scale;
    }

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

    public Cat(String name, int age, String hairColor) {
        super(name, age);
        this.hairColor = hairColor;
    }

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
        Fish fish = new Fish("清道夫",2,100);
        Cat cat = new Cat("喵喵",3,"red");

        fish.eat();
        System.out.println(fish.getDetails());

        cat.eat();
        System.out.println(cat.getDetails());
    }
}
