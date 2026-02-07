package com.powernode.switch06;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        int password = new Scanner(System.in).nextInt();
        if (password == 2009) {
            System.out.println("开门");
        } else if (password == 20092009) {//普通管理员
            System.out.println("添加员工\n删除员工");
        }else if (password == 200909) {
            System.out.println("分配权限\n取消权限");
        }else{
            System.out.println("密码错误");
        }
    }
}
