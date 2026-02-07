package com.powernode.exercise01;
class Computer{
    private double cpu;
    private int memory;
    private int hardDisk;

    public Computer(double cpu, int memory, int hardDisk) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public String say() {
        return "Computer{" +
                "cpu=" + cpu +
                ", memory=" + memory +
                ", hardDisk=" + hardDisk +
                '}';
    }
}
class Student{
    private String name;
    private int age;
    private Computer computer;

    public Student(String name, int age, Computer computer) {
        this.name = name;
        this.age = age;
        this.computer = computer;
    }

    public String say() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", computer=" + computer.say() +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer(1.8,32,3);
        Student student = new Student("zs",23,computer);
        System.out.println(student.say());
    }
}
