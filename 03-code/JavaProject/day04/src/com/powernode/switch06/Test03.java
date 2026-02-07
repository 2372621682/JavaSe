package com.powernode.switch06;

import java.util.Scanner;

public class Test03 {
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

        switch(password){
            case 2009:
                System.out.println("开门");
                break;//结束分支语句，防止case穿透
            case 20092009:
                System.out.println("添加员工\n删除员工");
                break;
            case 200909:
                System.out.println("分配权限\n取消权限");
            default:
                System.out.println("密码错误");
                break;//在实际的工作中，default一般写在最后，如果写在了最后break可以省略
        }
    }
}
