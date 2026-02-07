package com.powernode.stream07;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student implements Comparable<Student>{
    private String name;
    private int age;
    private char sex;
    private String city;

    public Student(String name, int age, char sex, String city) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.city = city;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return age == student.age && sex == student.sex && Objects.equals(name, student.name) && Objects.equals(city, student.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, city);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return age - o.age;
    }
}
public class StudentData {
    public static List<Student> getStudentList(){
        List<Student> list = new ArrayList<>();
        list.add(new Student("zs", 23, '男', "北京"));
        list.add(new Student("ls", 19, '女', "上海"));
        list.add(new Student("ww", 18, '女', "上海"));
        list.add(new Student("zl", 16, '女', "深圳"));
        return list;
    }
}
