package com.powernode.exercise01;

public class Test03 {
    public static void main(String[] args) {
        int area = method(11,6);
        System.out.println("area = " + area);
    }

    public static int method(int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m * n;
    }
}
