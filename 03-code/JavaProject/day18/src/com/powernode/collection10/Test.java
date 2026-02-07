package com.powernode.collection10;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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
        set.add(new Student("zs", 233));
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
         *
         * 4.HashSet 存储自定义对象，首先判断hashCode,hashCode都相等了，为什么还要判断equals
         *      4.1.哈希表的工作原理
         *          HashSet是依靠哈希表来实现的，采用的“数组 + 链表|红黑树”这种结构，当要存储一个对象时，会按照如下步骤：
         *             1.计算存储位置：借助hashCode算出hash值，进行确定该对象在数组中的存储位置
         *             2.处理hash冲突：有多个对象算出的hash值相同，这就是hash冲突，使用尾插法
         *     4.2.为什么要equals判断
         *         哈希冲突的影响，不同的对象可能会算出相同的hashCode,hashCode算出的位置仅仅表明对象存储在同一个位置，不能表明它们就是同一个对象
         *         确保元素的唯一性：HashSet不允许存储重复元素，就必须使用equals进行判断
         *
         *
         */
    }
}
