package com.powernode.interface04;
//飞行物
interface Flyer{
    /**
     * 1.接口中的属性都是：public static final的
     * 2.所以 public static final 可以省略
     */
   // public static final int SPEED = 120;
    int SPEED = 120;

}
public class Test {
    public static void main(String[] args) {
        //说明是static
        System.out.println(Flyer.SPEED);
        //Flyer.SPEED = 130;Cannot assign a value to final variable 'SPEED' 说明是final的
    }
}
