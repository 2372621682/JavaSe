package com.powernode.for05;

public class Test02 {
    public static void main(String[] args) {

       /* //双层循环模拟：3 % 2
        for (int i = 3; i < 4; i++) {
            for (int j = 2; j < i; j++) {
                System.out.print(i + " % " + j);
            }
        }
        System.out.println();
        //4 % 2   4 % 3
        for (int i = 4; i < 5; i++) {
            for (int j = 2; j < i; j++) {
                System.out.print(i + " % " + j + "\t");
            }
        }
        System.out.println();
        //5 % 2   5 % 3  5 % 4
        for (int i = 5; i < 6; i++) {
            for (int j = 2; j < i; j++) {
                System.out.print(i + " % " + j + "\t");
            }
        }*/
        for (int i = 3; i < 6; i++) {
            for (int j = 2; j < i; j++) {
                System.out.print(i + " % " + j + "\t");
            }
            System.out.println();
        }

    }
}
