package com.powernode.array08;

public class Test02 {
    public static void main(String[] args) {
        int[] ints1 = {1, 2, 3};
        int[] ints2 = {4, 5, 6};
        //二维数组中存储一维数组
        int[][] ints = {ints1, ints2};
        System.out.println(ints[0][0]);//1
        System.out.println(ints[0][1]);//2
        System.out.println(ints[0][2]);//3

        System.out.println(ints[1][0]);//4
        System.out.println(ints[1][1]);//5
        System.out.println(ints[1][2]);//6
        System.out.println("-----------------------");
        //双层for，外层循环执行一次，内存循环执行n次
        //外层循环控制行，内存循环控制列
        for (int i = 0; i < ints.length; i++) {//ints.length 二维数组的长度
            for (int j = 0; j < ints[i].length; j++) {//ints[i].length ,一维数组的长度
                System.out.println(ints[i][j]);
            }

        }


    }
}
