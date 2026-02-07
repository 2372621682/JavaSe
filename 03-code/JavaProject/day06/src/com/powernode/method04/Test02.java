package com.powernode.method04;

public class Test02 {
    public static void main(String[] args) {
        /**
         * 1.方法重载（会背）
         *    1.在同一个类中
         *    2.方法名称相同
         *    3.参数列表不同
         *       1.个数不同
         *       2.参数类型不同
         *       3.顺序不同【数据类型顺序】
         *  2.有什么好处：
         *    1.方便方法声明（名称统一，不用起过多的名称）
         *    2.方法他人,调用时不用记忆那么多的名称
         */
        add(2,3);
        add(2.3,2.2);
        add(2,3,4);
        //典型的方法重载
        System.out.println("abc");
        System.out.println(123);
        System.out.println(1.2);
    }
    public static void add(int x,int y){
        System.out.println(x +y);
    }

    public static void add(int x,float y){
        System.out.println(x +y);
    }
    public static void add(float x,int y){
        System.out.println(x +y);
    }


    public static void add(double x,double y){
        System.out.println(x +y);
    }

    public static void add(int x,int y,int z){
        System.out.println(x + y + z);
    }
}
