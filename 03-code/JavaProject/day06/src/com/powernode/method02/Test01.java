package com.powernode.method02;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 打印3行5列的矩形
         */
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        method();
        //想再打印一次3行5列的矩形
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        method();
    }
    public static void method(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
