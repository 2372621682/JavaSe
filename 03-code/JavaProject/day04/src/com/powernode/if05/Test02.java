package com.powernode.if05;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        //1.拿到用户输入的密码
        int password = new Scanner(System.in).nextInt();
        //2.编写分支语句进行判断：
        /*if(password == 2009){
            System.out.println("开门");
        }else if (password == 20092009) {
            System.out.println("添加员工");
            System.out.println("删除员工");
        }else if (password == 200909) {
            System.out.println("分配权限");
            System.out.println("取消权限");
        }else{
            System.out.println("密码错误，请重新输入");
        }*/
        String info = password == 2009 ? "开门" :
                password == 20092009 ? "添加员工\n删除员工" :
                password == 200909 ? "分配权限\n取消权限" : "密码错误，请重新输入";
        System.out.println(info);

    }
}
