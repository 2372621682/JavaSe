package com.powernode.exercise01;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("简易计算器(仅支持【加、减、乘、除】)");
            System.out.println("请输入第一个数：");
            double d1 = new Scanner(System.in).nextDouble();
            System.out.println("请输入运算符【+,-,*,/】");
            char operator = new Scanner(System.in).next().charAt(0);
            System.out.println("请输入第二个数：");
            double d2 = new Scanner(System.in).nextDouble();
            switch (operator) {
                case '+' -> System.out.println("结果为：" + (d1 + d2));
                case '-' -> System.out.println("结果为：" + (d1 - d2));
                case '*' -> System.out.println("结果为：" + d1 * d2);
                case '/' -> {
                    if (d2 == 0) {
                        System.out.println("除数不能为0");
                        continue;
                    }
                    System.out.println("结果为：" + d1 / d2);
                }
                default -> System.out.println("运算符无效");

            }
        }

    }

}
