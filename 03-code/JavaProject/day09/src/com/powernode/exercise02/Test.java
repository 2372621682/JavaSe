package com.powernode.exercise02;

class Cat{
    private String name = "喵喵";
    private int age = 2;
    private double weight = 1.2;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String say(){
        return "姓名：" + name + "\t年龄：" + age + "\t体重：" + weight;
    }

}
public class Test {
    public static void main(String[] args) {
        //数据类型  对象名称  = new 数据类型()
        Cat cat = new Cat();
        cat.setName("咪咪");
        cat.setAge(3);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.say());
    }
}
