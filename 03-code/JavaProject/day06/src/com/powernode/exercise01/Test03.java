package com.powernode.exercise01;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        int index = 0;
        do {
            System.out.println("请选择如下操作：");
            System.out.println("1.增加\t2.删除\t3.修改\t4.查询\t5.退出");
            System.out.print("请选择对应的操作：");
            index = new Scanner(System.in).nextInt();
            switch (index) {
                case 1:
                    System.out.println("----执行增加操作------");
                    break;
                case 2:
                    System.out.println("----执行删除操作------");
                    break;
                case 3:
                    System.out.println("----执行修改操作------");
                    break;
                case 4:
                    System.out.println("----执行查询操作------");
                    break;
                case 5:
                    System.out.println("----执行退出操作------");
                    break;
                default:
                    System.out.println("选择不合法，请选择(1-5)");
                    break;
            }
        } while (index != 5);
    }
}
