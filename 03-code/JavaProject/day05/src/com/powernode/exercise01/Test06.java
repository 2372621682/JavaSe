package com.powernode.exercise01;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        int index = new Scanner(System.in).nextInt();
        switch (index) {
            case 1 -> System.out.println("星期一");
            case 2 -> System.out.println("星期二");
            case 3 -> System.out.println("星期三");
            case 4 -> System.out.println("星期四");
            case 5 -> System.out.println("星期五");
            case 6 -> System.out.println("星期六");
            case 7 -> System.out.println("星期日");
            default -> System.out.println("非法参数");
        }
    }
}

