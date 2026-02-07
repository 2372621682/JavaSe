package com.powernode.exercise01;

import java.util.Scanner;

enum Week{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

public class TestWeek {
    public static void main(String[] args) {
        int index = new Scanner(System.in).nextInt();
        Week[] values = Week.values();
        try {
            printWeek(values[index-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("输入的数据不合法，请输入【1-7】");
        }
    }
    public static void printWeek(Week week){
        switch (week){
            case MONDAY -> System.out.println("星期一");
            case TUESDAY -> System.out.println("星期二");
            case WEDNESDAY -> System.out.println("星期三");
            case THURSDAY -> System.out.println("星期四");
            case FRIDAY -> System.out.println("星期五");
            case SATURDAY -> System.out.println("星期六");
            case SUNDAY -> System.out.println("星期日");
        }
    }
}
