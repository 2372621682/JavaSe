package com.powernode.switch06;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        int password = new Scanner(System.in).nextInt();
        switch(password){
            case 1:
                System.out.println("开门");
                break;//结束分支语句，防止case穿透
            case 2:
                System.out.println("添加员工\n删除员工");
                break;
            case 3:
                System.out.println("分配权限\n取消权限");
            default:
                System.out.println("密码错误");
                break;//在实际的工作中，default一般写在最后，如果写在了最后break可以省略
        }
    }
}
