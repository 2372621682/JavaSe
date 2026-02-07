package com.powernode.for05;

public class Test04 {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("======内层循环======");
                break;//结束的是内层循环
                //System.out.println("----------");Unreachable statement

            }
            System.out.println("======外层循环======");
        }
        System.out.println("======main方法======");


    }
}
