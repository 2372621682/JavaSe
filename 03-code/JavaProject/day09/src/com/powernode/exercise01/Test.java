package com.powernode.exercise01;

class Student{
    private String name = "zs";
    private char gender = '男';
    private int age = 23;
    private int id = 1001;
    private double score = 99.9;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        if (gender != '男' && gender != '女') {
            System.out.println("性别不合法");
            return;
        }
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }
}
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        //student.gender = 'X';
        student.setGender('女');
        System.out.println(student.getGender());

        System.out.println(student.getName());
        student.setName("ww");
        System.out.println(student.getName());
    }
}
