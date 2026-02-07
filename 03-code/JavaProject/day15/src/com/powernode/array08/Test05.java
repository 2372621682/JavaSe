package com.powernode.array08;

public class Test05 {
    public static void main(String[] args) {
        int[][] ints = new int[2][3];
        ints[0][0] = 1;
        ints[0][1] = 2;
        ints[0][2] = 3;

        ints[1][0] = 4;
        ints[1][1] = 5;
        ints[1][2] = 6;

        /*for (int i = 0; i < ints.length; i++) {
            int[] anInt = ints[i];
            for (int j = 0; j < anInt.length; j++) {
                int i1 = anInt[j];
                System.out.println("i1 = " + i1);
            }
        }*/
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println(ints[i][j]);
            }
        }

    }
}
