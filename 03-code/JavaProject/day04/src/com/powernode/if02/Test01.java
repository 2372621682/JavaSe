package com.powernode.if02;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        //接受用户输入的整数，赋值给x(目前不需要掌握)
        int x = new Scanner(System.in).nextInt();
        System.out.println("x = " + x);

        System.out.println("请输入一个小数：");
        double d = new Scanner(System.in).nextDouble();
        System.out.println("d = " + d);

        System.out.println("请输入一个字符串：");
        String str = new Scanner(System.in).next();
        System.out.println("str = " + str);
    }
}
