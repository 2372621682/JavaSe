package com.powernode.relevancy11;

class Computer{
    private double cpu;
    private int memory;
    private int hardDisk;

    public Computer(double cpu, int memory, int hardDisk) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public String getDetails(){
        return "cpu:" + cpu + "\t内存：" + memory + "\t硬盘：" + hardDisk;
    }
}
class Teacher {
    private String name;
    private int age;
    //老师有电脑
    private Computer computer;//基本类型的变量 叫变量 ，引用类型的变量 叫对象
    public Teacher(String name,int age,Computer computer){
        this.name = name;
        this.age = age;
        this.computer = computer;
    }
    public String getDetails(){
        return "姓名：" + name + "\t年龄：" + age + "\t电脑配置：" + computer.getDetails();
    }
}
public class Test {
    public static void main(String[] args) {
        //1.创建电脑对象
        Computer computer = new Computer(1.8,16,3);
        //2.创建老师对象
        Teacher teacher = new Teacher("zs",23,computer);
        System.out.println(teacher.getDetails());
    }
}
