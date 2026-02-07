package com.powernode.dowhile03;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
       //输出【1-6】之间2的倍数
        //输出1-6
        int i = 1;
        do{
            //加入判断，如果是2的倍数就输出
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }while(i ++ < 6);

    }
}
