package com.powernode.interface06;
//飞行物（接口）
public interface Flyer {
    //起飞
    void takeOff();
    //飞行
    void fly();
    //着陆
    void land();
}
//宠物（抽象类）
abstract class Pet{
    private String name;
    public abstract void eat();
    public abstract void sleep();
}
//具体类(Bird)：Bird继承了Pet，并实现了Flyer
class Bird extends Pet implements Flyer{

    @Override
    public void takeOff() {
        System.out.println("Bird.takeOff");
    }

    @Override
    public void fly() {
        System.out.println("Bird.fly");
    }

    @Override
    public void land() {
        System.out.println("Bird.land");
    }

    @Override
    public void eat() {
        System.out.println("Bird.eat");
    }

    @Override
    public void sleep() {
        System.out.println("Bird.sleep");
    }
}
class Test{
    public static void main(String[] args) {
        //1.本太调用
        Bird bird = new Bird();
        //可以调用5个方法
        bird.fly();
        bird.eat();

        //2.抽象类多态
        Pet pet = new Bird();
        //调用自己
        pet.eat();
        pet.sleep();

        //3.接口多态
        Flyer flyer = new Bird();
        //调用直接的
        flyer.fly();
        flyer.land();
        flyer.takeOff();

        //多态指的方法多态：编译看父类，运行看子类

    }
}