package com.powernode.exercise01;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        int index = new Scanner(System.in).nextInt();
        switch (index){
            case 1:
                System.out.println("星期一");
                break;//防止case穿透，结束switch语句
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("非法参数");
        }
    }
}

