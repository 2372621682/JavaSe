package com.powernode.exercise01;

public class Test02 {
    public static void main(String[] args) {
        int area = method();
        System.out.println("area = " + area);
    }

    public static int method(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 10 * 8;
    }
}
