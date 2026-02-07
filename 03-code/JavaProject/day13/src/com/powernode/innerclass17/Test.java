package com.powernode.innerclass17;
interface Flyer{
    void fly();
}
class Bird implements Flyer{

    @Override
    public void fly() {
        System.out.println("Bird.fly");
    }
}
public class Test {
    public static void main(String[] args) {
        Flyer flyer = new Bird();
        flyer.fly();
    }
}
