package com.powernode.innerclass18;
interface Flyer{
    void fly();
 /*   void land();*/
}

public class Test {
    public static void main(String[] args) {

        /*Flyer flyer = new Flyer() {
            @Override
            public void fly() {
                System.out.println("Test.fly");
            }
        };
        flyer.fly();*/
        /**
         * 1.接口只有一个抽象方法
         * 2.实现类只创建一个对象，且调用一次重写的方法
         * 3.类似这种情况，我们通常使用匿名内部类来解决
         */
        new Flyer() {
            @Override
            public void fly() {
                System.out.println("Test.fly");
            }
        }.fly();
    }
}
