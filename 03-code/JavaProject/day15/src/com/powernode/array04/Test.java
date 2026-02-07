package com.powernode.array04;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

class Teacher implements Comparable{
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 1.升序的规则
     *    1.第一个数  > 第二个数：正整数
     *    2.第一个数  < 第二个数：负整数
     *    3.第一个数  = 第二个数：零
     * 2.按照年龄排序
     * 3.涉及2个对象
     *    1.this
     *    2.o
     */
    @Override
    public int compareTo(Object o) {
        Teacher teacher = (Teacher) o;
        if (this.age > teacher.age) {
            return 1;
        } else if (this.age < teacher.age) {
            return -1;
        }
        return 0;
    }
}

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("zs",23);
        Teacher t2 = new Teacher("ls",20);
        Teacher t3 = new Teacher("ww",26);

        Teacher[] teachers = {t1, t2,t3};
        /**
         * java.lang.ClassCastException : 类型转换异常
         *   1.Teacher cannot be cast to class Comparable : 自定义对象不能转换为Comparable
         *   2.程序在运行的过程中，Teacher 自动转换为  Comparable
         *   3.什么情况下Teacher可以转换Comparable 【Teacher 实现 Comparable】
         *   4.自定义对象排序
         *      1.实现 Comparable
         *      2.重写compareTo
         *
         */
        Arrays.sort(teachers);
        System.out.println(Arrays.toString(teachers));

    }
}
