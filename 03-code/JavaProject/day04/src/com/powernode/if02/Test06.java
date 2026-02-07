package com.powernode.if02;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        /**
         * 需求：模拟门禁卡，用户输入密码，正确执行开门操作
         *    1.拿到用户输入的密码
         *    2.编写分支语句进行判断：
         *      如果(员工密码 == 2009){
         *          执行开门
         *      }如果(普通管理员密码 == 20092009){、
         *          添加员工
         *          删除员工
         *      }如果(超级管理员 == 200909){
         *          分配权限
         *          取消权限
         *      }否则{
         *          密码错误，请重新输入
         *      }
         *      -------------------------------
         *      if(<条件表达式>){
         *          执行开门
         *      }else if(<条件表达式>){
         *          添加员工
         *          删除员工
         *      }else if(<条件表达式>){
         *          分配权限
         *          取消权限
         *      }else{
         *          密码错误，请重新输入
         *      }
         */
        //1.拿到用户输入的密码
        int password = new Scanner(System.in).nextInt();
        //2.编写分支语句进行判断：
        if(password == 2009){
            System.out.println("开门");
        }else if (password == 20092009) {
            System.out.println("添加员工");
            System.out.println("删除员工");
        }else if (password == 200909) {
            System.out.println("分配权限");
            System.out.println("取消权限");
        }else{
            System.out.println("密码错误，请重新输入");
        }
    }
}
