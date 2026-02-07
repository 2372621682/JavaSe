package com.powernode.array05;

import java.util.Arrays;

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
    //首先按照年龄进行排序，年龄排不开了，按照姓名
    @Override
    public int compareTo(Object o) {
        Teacher teacher = (Teacher) o;
        if (age > teacher.age) {
            return 1;
        } else if (age < teacher.age) {
            return -1;
        }
        return name.compareTo(teacher.name);
    }
}
public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("aa", 23);
        Teacher t2 = new Teacher("cc", 20);
        Teacher t3 = new Teacher("bb", 20);
        Teacher t4 = new Teacher("dd", 26);

        Teacher[] teachers = {t1, t2, t3,t4};
        Arrays.sort(teachers);
        System.out.println(Arrays.toString(teachers));
    }
}
