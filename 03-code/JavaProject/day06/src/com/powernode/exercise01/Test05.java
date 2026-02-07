package com.powernode.exercise01;

public class Test05 {
    public static void main(String[] args) {
        /**
         * 1.输出[1-6]之间的质数
         * 2.什么是质数
         *   1.除了1和本身外，不能被其他自然是整除
         *   2.1.既不是质数，也不是合数
         *   3.2.是质数
         * 3.拿到一个数，除以比它小的数
         *   1.有除尽的，说明不是质数
         *   2.都除不尽说明是质数
         * 4.模拟：
         *   3 % 2
         *   4 % 2 4 % 3
         *   5 % 2 5 % 3 5 % 4
         */
        //双层for循环模拟3 % 2
        for (int i = 100; i <= 200 ; i++) {
            //假设i是质数
            boolean flag = true;
            for (int j = 2; j < i ; j++) {
                if (i % j == 0) {//i不是质数
                    flag = false;
                    break;//结束内层循环
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }

    }
}
