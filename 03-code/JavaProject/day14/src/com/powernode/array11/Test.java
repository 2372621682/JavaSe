package com.powernode.array11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * 1.do-while应用场景（简易版的增删改查的逻辑）
         * 2.界面如下：
         *    请选择如下操作：
         *       1.增加    2.删除    3.修改    4.查询    5.退出
         * 3.选择对应的编号执行相应的操作
         */
        int num = 0;
        do {
            System.out.println("请选择如下操作：");
            System.out.println("1.增加   2.删除   3.修改   4.查询   5.退出");
            System.out.println("请选择（1-5）：");
            num = new Scanner(System.in).nextInt();
            switch (num) {
                case 1 -> System.out.println("----------执行增加操作------------");
                case 2 -> System.out.println("----------执行删除操作------------");
                case 3 -> System.out.println("----------执行修改操作------------");
                case 4 -> System.out.println("----------执行查询操作------------");
                case 5 -> System.out.println("----------执行退出操作------------");
                default -> System.out.println("----------无效操作------------");
            }
        }while(num != 5);
    }
}
