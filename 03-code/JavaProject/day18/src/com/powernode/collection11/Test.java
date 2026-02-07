package com.powernode.collection11;

import java.sql.Struct;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{
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


    @Override
    public int compareTo(Student o) {
        if (age > o.age) {
            return 1;
        } else if (age < o.age) {
            return -1;
        }
        return name.compareTo(o.name);
    }
}
public class Test {
    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>();
        set.add(new Student("zs", 23));
        set.add(new Student("zs", 23));
        System.out.println(set);
        /**
         *  1. ClassCastException: Student cannot be cast to class Comparable
         *  2. TreeSet存储自定义对象，该类必须实现Comparable接口
         *  3. 因为TreeSet按照自然顺序排序，所以存储的对象必须具有比较性
         *  4. 自定义对象具有比较性，必须实现Comparable接口
         *      1.compareTo 对象两个对象的内容是否相同，如果相同不添加到TreeSet
         *      2.compareTo 尽量把所有的属性都写上
         */
    }
}
