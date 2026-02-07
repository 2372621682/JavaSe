package com.powernode.interface10;

public interface Swimming {
    void swim();
}
interface Flyer extends Swimming{
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

    @Override
    public void swim() {
        System.out.println("Bird.swim");
    }
}
class Test{
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.swim();

        Flyer flyer = new Bird();
        flyer.fly();
        flyer.swim();

        Swimming swimming = new Bird();
        swimming.swim();
    }
}