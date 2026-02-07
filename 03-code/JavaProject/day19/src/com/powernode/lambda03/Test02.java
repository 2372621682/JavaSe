package com.powernode.lambda03;

@FunctionalInterface //约束改接口只能有一个抽象方法
interface Flyer{
    void land();
   // void fly();
    private void takeOff(){
        System.out.println("Flyer.takeOff");
    }
}
public class Test02 {
    @Override //约束该方法必须重写父类的
    public String toString() {
        return super.toString();
    }
}
