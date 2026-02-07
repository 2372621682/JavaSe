package com.powernode.array03;

public class Test01 {

    public static void main(String[] args) {
        add(2,3);
        add(2,3,4);
    }
   /* //定义一个方法，计算 2 个整数相加
    public static void add(int x,int y){
        System.out.println(x + y);
    }
    //定义一个方法，计算 3 个整数相加
    public static void add(int x,int y,int z){
        System.out.println(x + y + z);
    }*/
    //定义一个方法，计算 n 个整数相加
    public static void add(int ... ints){//可变参数是数组类型，在形参可以这么写
       int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        System.out.println(sum);
    }
}
