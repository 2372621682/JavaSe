package com.powernode.exercise01;

public class Test05 {
    public static void main(String[] args) {
        /**
         * - 方法重载
         *   1.在同一个类中
         *   2.方法名称相同
         *   3.参数列表不同
         *      1.个数不同
         *      2.类型不同
         *      3.顺序不同
         *
         */
        System.out.println(div(4.8, 2.1));
        System.out.println(div(4.8f, 2.1f));
    }
    public static double div(double x ,double y){
        System.out.println("(double x ,double y)");
        return x / y;

    }
    public static float div(float x,float y){
        System.out.println("(float x,float y)");
        return x / y;
    }

}
