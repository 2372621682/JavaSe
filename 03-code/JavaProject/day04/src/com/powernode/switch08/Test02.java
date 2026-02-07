package com.powernode.switch08;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        int month = new Scanner(System.in).nextInt();
        /*switch (month){
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

        }*/
        //有多条语句添加{}
        switch (month){
            case 1,2,3->{
                System.out.println("第一季度");
                System.out.println("冬季");
            }
            case 4,5,6->{
                System.out.println("第二季度");
                System.out.println("春季");
            }
            case 7,8,9->{
                System.out.println("第三季度");
                System.out.println("夏季");
            }
            case 10,11,12->{
                System.out.println("第四季度");
                System.out.println("秋季");
            }
            default-> System.out.println("输入月份不合法");

        }
    }
}
