package com.powernode.while02;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        /**
         * 死循环
         *   1.没有结束循环的条件
         *   2.循环体一直执行
         */
        while(true){
            System.out.println("输入第一个整数：");
            int x = new Scanner(System.in).nextInt();
            System.out.println("输入第二个整数：");
            int y = new Scanner(System.in).nextInt();
            System.out.println("两数之和：" + (x + y));
        }

    }
}
