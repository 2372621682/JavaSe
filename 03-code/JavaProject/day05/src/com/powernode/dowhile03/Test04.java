package com.powernode.dowhile03;

public class Test04 {
    public static void main(String[] args) {
       //输出【1-6】之间2的倍数
        //输出1-6
        int i = 0;
        while(i++ < 6){
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }

    }
}
