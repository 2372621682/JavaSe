package com.powernode.exercise01;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable{
    private String name;
    private int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        /*if (this.age > student.age) {
            return 1;
        } else if (this.age < student.age) {
            return -1;
        }
        return 0;*/
        return age - student.age;
    }
}

public class Test01 {
    public static void main(String[] args) {
        Student s1 = new Student("zs",23);
        Student s2 = new Student("ls",20);
        Student[] students = {s1, s2};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
