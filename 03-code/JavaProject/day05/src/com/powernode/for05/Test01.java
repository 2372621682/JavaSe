package com.powernode.for05;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 1.输出【1-6】之间的质数
         * 2.什么是质数
         *    1.除了1和本身外，不能被其他自然数整除
         *    2.1 既不是质数，也不是合数
         *    2.2是质数
         * 3.拿到一个数，怎么知道它是不是质数？
         *   1.除以比它小的数
         *   2.除尽了说明不是质数
         *   3.除不尽说明是质数
         * 4.模拟：
         *   3 % 2
         *   4 % 2   4 % 3
         *   5 % 2   5 % 3  5 % 4
         */
        //双层循环模拟：3 % 2
        for (int i = 3; i < 4; i++) {
            for (int j = 2; j < 3; j++) {
                System.out.print(i + " % " + j);
            }
        }
        System.out.println();
        //4 % 2   4 % 3
        for (int i = 4; i < 5; i++) {
            for (int j = 2; j < 4; j++) {
                System.out.print(i + " % " + j + "\t");
            }
        }
        System.out.println();
        //5 % 2   5 % 3  5 % 4
        for (int i = 5; i < 6; i++) {
            for (int j = 2; j < 5; j++) {
                System.out.print(i + " % " + j + "\t");
            }
        }
    }
}