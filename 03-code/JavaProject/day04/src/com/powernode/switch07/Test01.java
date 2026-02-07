package com.powernode.switch07;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 一年四个季度:
         *  第一季度：1 、2 、3 : 冬季
         *  第二季度：4 、5 、6 ：春季
         *  第三季度：7 、8 、9 ：夏季
         *  第四季度：10 、11 、12 ：秋季
         * 接收一个月份，判断是第几季度，并输出季度和季节
         */
        int month = new Scanner(System.in).nextInt();
        if (month == 1 || month == 2 || month == 3) {
            System.out.println("第一季度");
            System.out.println("冬季");
        } else if (month == 4 || month == 5 || month == 6) {
            System.out.println("第二季度");
            System.out.println("春季");
        }else if (month == 7 || month == 8 || month == 9) {
            System.out.println("第三季度");
            System.out.println("夏季");
        }else if (month == 10 || month == 11 || month == 12) {
            System.out.println("第四季度");
            System.out.println("秋季");
        }else{
            System.out.println("输入月份不合法");
        }
        System.out.println("----------------------");
        switch (month){
            case 1,2,3:
                System.out.println("第一季度");
                System.out.println("冬季");
                break;
            case 4,5,6:
                System.out.println("第二季度");
                System.out.println("春季");
                break;
            case 7,8,9:
                System.out.println("第三季度");
                System.out.println("夏季");
                break;
            case 10,11,12:
                System.out.println("第四季度");
                System.out.println("秋季");
                break;
            default:
                System.out.println("输入月份不合法");

        }
    }
}
