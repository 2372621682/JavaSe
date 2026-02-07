package com.powernode.object15;

import java.util.Objects;

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        //根据name和age生成hash码，如果两个对象的name和age相等，那么hash码也相等
        return Objects.hash(name,age);
    }
}
public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("喵喵",3);
        Cat cat2 = new Cat("喵喵",3);
        System.out.println("cat1 = " + cat1.hashCode());
        System.out.println("cat2 = " + cat2.hashCode());
        /**
         * 1.如果两个对象的内容相同，那么hashCode不一定相等
         * 2.如果两个对象的hash码相等，那么那么内容一定相等
         */
        //cat2 = cat1;
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat1 == cat2);//false
    }
}
