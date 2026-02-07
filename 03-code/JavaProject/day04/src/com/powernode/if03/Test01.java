package com.powernode.if03;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        //1.拿到用户输入的密码
        int password = new Scanner(System.in).nextInt();
        //2.编写分支语句进行判断：
        /*if(password == 2009){
            System.out.println("开门");
        }*/
        /**
         * 1.如果if语句块中只有一条语句，{}可以省略
         * 2.省略后，相当于if语句后的第一条语句写在了{}中
         * 3.if语句块中有多条语句，不可以省略
         */
        if (password == 2009)
            System.out.println("开门");
            System.out.println("--------");

        System.out.println("if语句执行完毕我开始执行");

    }
}
