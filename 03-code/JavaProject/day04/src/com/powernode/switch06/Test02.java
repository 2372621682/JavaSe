package com.powernode.switch06;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        int password = new Scanner(System.in).nextInt();
        if (password == 2009) {
            System.out.println("开门");
        } else if (password == 20092009) {
            System.out.println("添加员工\n删除员工");
        }

        switch(password){
            case 2009:
                System.out.println("开门");
                break;//结束分支语句，防止case穿透
            case 20092009:
                System.out.println("添加员工\n删除员工");
                break;
        }
    }
}
