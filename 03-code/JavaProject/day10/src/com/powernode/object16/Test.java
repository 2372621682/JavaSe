package com.powernode.object16;

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
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());

        //身份hashCode
        System.out.println(System.identityHashCode(cat1));
        System.out.println(System.identityHashCode(cat2));
        //== 可以理解为比较的是 身份hashCode,重写了hashCode,身份hash不变
        System.out.println(cat1 == cat2);
    }
}
