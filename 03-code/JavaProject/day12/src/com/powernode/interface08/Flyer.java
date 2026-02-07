package com.powernode.interface08;

public interface Flyer {
    void takeOff();
    void fly();
    void land();
}
class Bird implements Flyer{

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
}
class Test{
    public static void main(String[] args) {
        Flyer flyer = new Bird();
        flyer.fly();
        flyer.land();
        flyer.takeOff();
    }
}
