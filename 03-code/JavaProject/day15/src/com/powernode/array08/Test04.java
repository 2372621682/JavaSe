package com.powernode.array08;

public class Test04 {
    public static void main(String[] args) {
        /*int[] ints1 = {1, 2, 3};
        int[] ints2 = {4, 5, 6};*/
        //二维数组中存储一维数组
        int[][] ints = {{1, 2, 3}, {4, 5, 6}};

        ints = new int[][]{{7,8,9}, {1,2}};

        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.println(i);
            }
        }

        //int [][] ints1 = new int[2][];

    }
}
