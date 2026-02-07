package com.powernode.for07;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 九九乘法表
         * 1×1=1
         * 1×2=2  2×2=4
         * 1×3=3  2×3=6  3×3=9
         * 1×4=4  2×4=8  3×4=12 4×4=16
         * 1×5=5  2×5=10 3×5=15 4×5=20 5×5=25
         */
        //1×1=1
        for (int i = 1; i <= 1 ; i++) {
            for (int j = 1; j <= 1 ; j++) {
                System.out.print(j + " * " + i + " = " + (j * i));
            }
        }
        System.out.println();
        //1×2=2  2×2=4
        for (int i = 2; i <= 2 ; i++) {
            for (int j = 1; j <= 2 ; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
        }
        System.out.println();
        //1×3=3  2×3=6  3×3=9
        for (int i = 3; i <= 3; i++) {
            for (int j = 1; j <= 3 ; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
        }
        System.out.println();
        for (int i = 4; i <= 4; i++) {
            for (int j = 1; j <= 4 ; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
        }
        System.out.println();
        for (int i = 5; i <= 5; i++) {
            for (int j = 1; j <= 5 ; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
        }
    }
}
