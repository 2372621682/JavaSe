package com.powernode.for05;

public class Test03 {
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
        for (int i = 2; i <= 6; i++) {
            //假设所有的i都是质数
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0 ) {//不是质数
                    //假设不成立
                    flag = false;
                    break;//结束内层循环
                }
                //System.out.print(i + " % " + j + "\t");
            }
            //输出质数
            if (flag) {
                System.out.println("i = " + i);
            }
        }

    }
}
