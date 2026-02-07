package com.powernode.exercise01;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        long uname = new Scanner(System.in).nextLong();
        int password = new Scanner(System.in).nextInt();
        if (uname == 18610241888L && password == 123) {
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败\n账号或密码错误");
        }
    }

}
