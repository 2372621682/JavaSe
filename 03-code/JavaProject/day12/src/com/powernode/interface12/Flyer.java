package com.powernode.interface12;

public interface Flyer {
    //默认方法
    public default void land(){
        System.out.println("Flyer.land");
    }
}
class Bird implements Flyer{
    //默认方法重写: 去掉default
    @Override
    public void land() {
        System.out.println("Bird.land");
    }
}
class Test{
    public static void main(String[] args) {
        Flyer flyer = new Bird();
        flyer.land();
    }
}
