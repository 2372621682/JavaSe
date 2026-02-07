package com.powernode.exception06;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        int y = new Scanner(System.in).nextInt();
        /**
         * 1.没有异常存在的问题
         *   1.如果y = 0 （除数不能为0）
         *   2.程序出现异常，JVM终止工作
         *   3.为了让用户有更好的体验，可以通过异常处理，不让JVM直接终止工作
         */
        int num = 0;
        try {
            num = div(x, y);
        } catch (Exception e) {
            System.out.println("除数不能为0");
            return;
        }
        System.out.println(num);
    }

    private static int div(int x, int y) {
        return x / y;
    }

}
