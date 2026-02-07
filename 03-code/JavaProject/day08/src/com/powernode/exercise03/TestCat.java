package com.powernode.exercise03;

class Cat{
    String name = "喵喵";
    int age = 2;
    double weight = 1.2;

    public String say(){
        return "名词：" + name + "\t年龄：" + age + "\t重量：" + weight;
    }
}
public class TestCat {
    public static void main(String[] args) {
        //数据类型  对象名称 = new 数据类型();
        Cat cat = new Cat();
        System.out.println(cat.say());
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.weight);
    }
}
