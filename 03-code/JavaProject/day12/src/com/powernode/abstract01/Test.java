package com.powernode.abstract01;

/**
 * 1.定义抽象类的关键字是abstract
 * 2.抽象类中可以包含非抽象方法
 * 3.抽象类中可以包含实例|静态变量
 * 4.抽象类可以包含构造器
 * 5.抽象类不可以直接创建对象（通过子类来创建）
 * 6.抽象类适用于多态
 */
abstract class Pet{
   /* public abstract void eat();*/
    private String name;
    //public static String city;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Cat extends Pet{
    private String hireColor;
    Cat(String name,String hireColor){
        super(name);
    }
}
public class Test {
    public static void main(String[] args) {
        //抽象类适用于多态
        Pet pet = new Cat("喵喵","red");
    }
}
