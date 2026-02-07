package com.powernode.exception06;

public class Test03 {
    public static void main(String[] args) {
        method01();
    }
    private static void method01() {
        System.out.println("Test03.method01");
        method02();
    }
    private static void method02() {
        System.out.println("Test03.method02");
        method03();
    }
    private static void method03() {
        System.out.println("Test03.method03");
        div(5, 0);
    }
    private static void div(int x, int y) {
        System.out.println(x / y );
    }
}
