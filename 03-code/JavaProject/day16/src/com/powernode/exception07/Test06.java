package com.powernode.exception07;

import java.util.concurrent.locks.ReentrantLock;

public class Test06 {
    public static void main(String[] args) {
        try {
            int num = div(10,0);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
            return;
        } finally {
            System.out.println("=====finally在return之前执行=====");
        }
    }

    private static int div(int x, int y) {
        return x / y;
    }

}
