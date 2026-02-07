package com.powernode.private11;
class Dog {
    private String name = "旺财";
    private int age = 23;
    private char sex = '女';

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }
}
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("汪汪");
        dog.setSex('男');
        System.out.println(dog.getName());
        System.out.println(dog.getSex());

    }
}
