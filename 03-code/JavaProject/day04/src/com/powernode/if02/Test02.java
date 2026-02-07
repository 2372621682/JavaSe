package com.powernode.if02;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        /**
         * 需求：模拟门禁卡，用户输入密码，正确执行开门操作
         *    1.拿到用户输入的密码
         *    2.编写分支语句进行判断：
         *      如果(密码正确){
         *          执行开门
         *      }
         *      if(<条件表达式>){
         *          执行开门 //语句语句块
         *      }
         *    3.执行过程：
         *      1.<条件表达式>
         *          1.true:执行if语句块，开门
         *          2.false：不执行if语句块，继续往下执行
         */
        //1.拿到用户输入的密码
        int password = new Scanner(System.in).nextInt();
        //2.编写分支语句进行判断：
        if(password == 2009){
            System.out.println("开门");
        }
        System.out.println("if语句执行完毕我开始执行");

    }
}
