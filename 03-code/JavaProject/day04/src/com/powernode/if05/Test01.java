package com.powernode.if05;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        //1.拿到用户输入的密码
        int password = new Scanner(System.in).nextInt();
        /*//2.编写分支语句进行判断：
        if(password == 2009){
            System.out.println("开门");
        }else{
            System.out.println("密码错误，请重新输入");
        }*/
        String info = password == 2009 ? "开门" : "密码错误，请重新输入";
        System.out.println(info);

    }
}
