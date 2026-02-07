package com.powernode.array08;

public class Test03 {
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
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.println(i);
            }
        }


    }
}
