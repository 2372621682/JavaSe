package com.powernode.exercise02;

class Student{
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Student student = new Student("zs",23,"北京");
        System.out.println(student);
        System.out.println(student.toString());
    }
}
