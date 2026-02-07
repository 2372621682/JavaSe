package com.powernode.exercise04;

import java.util.Objects;

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    /**
     * 1.先找两个对象
     *    1.this：d1调用了equals ： this = d1
     *    2.obj : 传入的参数d2 : Object obj = d2
     * 2.
     */
    @Override
    public boolean equals(Object obj) {
        //如果两个对象的地址相同，不用比较内容
        if (this == obj) return true;
        //this不为null，obj为null，不具有可不行，直接返回false
        //如果两个对象不是一个类生成的，不具有可比性
        if (obj == null || getClass() != obj.getClass()) return false;
        Dog d2 = (Dog) obj;
        return age == d2.age && name.equals(d2.name);
    }

    @Override
    public int hashCode() {
        //如果name和age的值相同，那么生成的hash码也相同
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog("旺财",3);
        Dog d2 = new Dog("旺财",3);

        System.out.println(d1.equals(d2));
        /**
         * 1.两个对象的hashCode相等，那么一定equals码
         * 2.两个对象的hashCode不相等，那么一定不equals码
         */
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
        System.out.println(d1 == d2);

    }
}
