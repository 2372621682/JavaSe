package com.powernode.exercise04;

class Cat{
    String name;
    int age = 1;
    double weight = 10;

    public String say(){
        return "名词：" + name + "\t年龄：" + age + "\t重量：" + weight;
    }
}
public class TestCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1.say());
        System.out.println(cat2.say());

        cat1.name = "喵喵";
        cat2.name = "咪咪";
        cat2.weight = 8;

        System.out.println(cat1.say());
        System.out.println(cat2.say());




    }
}
