package com.powernode.object13;

class Cat extends Object{
    private String name = "喵喵";
    private int age = 2;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);//输出对象，默认调用了对象的toString方法
        System.out.println(cat.toString());
    }
}
