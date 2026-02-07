package com.powernode.collection09;

import java.util.HashSet;
import java.util.Set;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("zs", 23));
        set.add(new Student("zs", 23));
        System.out.println(set);
        /**
         * 1.Set 无序不可重复，为什么两个对象都存储进去了呢？
         * 2.HashSet存储的是两个对象，对象的属性是zs,23,所以都存储进去了
         * 3.Set存储自定义对象，保证属性唯一
         *     1.通过hashCode和equals进行保证
         *     2.首先判断hashCode
         *        1.相等，调用equals判断内容
         *           1.true:相同不添加
         *           2.false：不相同添加
         *        2.不相等
         *             不会调用equals直接添加
         */
    }
}
