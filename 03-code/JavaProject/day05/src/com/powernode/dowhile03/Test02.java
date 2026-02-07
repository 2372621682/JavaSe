package com.powernode.dowhile03;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        /**
         * 1.do-while应用场景（简易版的增删改查的逻辑）
         * 2.界面如下：
         *    请选择如下操作：
         *       1.增加    2.删除    3.修改    4.查询    5.退出
         * 3.选择对应的编号执行相应的操作
         */
        int index = 0;
        do {
            //1.输出界面
            System.out.println("请选择如下操作：");
            System.out.print("1.增加\t");
            System.out.print("2.删除\t");
            System.out.print("3.修改\t");
            System.out.print("4.查询\t");
            System.out.println("5.退出\t");
            System.out.print("请选择：");
            index = new Scanner(System.in).nextInt();
            switch (index) {
                case 1 -> System.out.println("-----执行增加操作-----");
                case 2 -> System.out.println("-----执行删除操作-----");
                case 3 -> System.out.println("-----执行修改操作-----");
                case 4 -> System.out.println("-----执行查询操作-----");
                case 5 -> System.out.println("-----执行退出操作-----");
                default -> System.out.println("无效操作，请选择(1-5)");
            }
        }while(index != 5);//如果用户输入的不是5，循环一直执行，输入5结束
    }
}
