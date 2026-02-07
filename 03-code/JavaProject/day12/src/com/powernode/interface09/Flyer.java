package com.powernode.interface09;

import javax.print.attribute.standard.PagesPerMinute;

public interface Flyer {
    void takeOff();
    void land();
    void fly();
}
interface Swimming{
    void swim();
}
//接口多实现，中间使用逗号隔开
class Bird implements Flyer,Swimming{

    @Override
    public void takeOff() {
        System.out.println("Bird.takeOff");
    }

    @Override
    public void land() {
        System.out.println("Bird.land");
    }

    @Override
    public void fly() {
        System.out.println("Bird.fly");
    }

    @Override
    public void swim() {
        System.out.println("Bird.swim");
    }
}
class Test{
    public static void main(String[] args) {
        Flyer flyer = new Bird();
        flyer.land();
        flyer.fly();
        flyer.takeOff();
        //两个干爹之间没有关系
        Swimming swimming = new Bird();
        swimming.swim();
    }
}
