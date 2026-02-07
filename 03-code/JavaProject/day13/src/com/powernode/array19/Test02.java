package com.powernode.array19;

public class Test02 {
    public static void main(String[] args) {
       //1.语法：数据类型 [] 数组名称 = new 数据类型[长度]
        int[] ints = new int[3];
        //int ints1 [] = new int[3];不推荐使用
        //2.向数组中存数据
        ints[0] = 3;
        ints[1] = 4;
        ints[2] = 5;
        //3.从数组中存数据
        System.out.println("ints[0] = " + ints[0]);
        System.out.println("ints[1] = " + ints[1]);
        System.out.println("ints[2] = " + ints[2]);
    }
}
