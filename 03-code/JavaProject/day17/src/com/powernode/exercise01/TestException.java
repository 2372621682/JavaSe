package com.powernode.exercise01;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        int y = new Scanner(System.in).nextInt();

        try {
            System.out.println(x / y);
        } catch (Exception e) {
            System.out.println("除数不能为0");
        }

        System.out.println("测试除数为0是否输出");
    }
}
