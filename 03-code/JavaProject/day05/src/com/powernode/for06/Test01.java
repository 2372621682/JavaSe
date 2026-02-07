package com.powernode.for06;

public class Test01 {

    public static void main(String[] args) {
        //输出【1-6】之间2的倍数
        for (int i = 1; i < 7; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }
        System.out.println("----------------");
        for (int i = 1; i < 7; i++) {
            if (i % 2 != 0) {//如果不是2的倍数
                continue;//结束当前当次循环，继续下一次循环
                //System.out.println("----");Unreachable statement
            }
            System.out.println("i = " + i);
        }


    }
}
