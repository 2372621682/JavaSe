package com.powernode.array15;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5};
        /**
         * 1.相邻两个交换位置
         * 2.如前一个 < 后一个 就交换位置
         *    第一次：{1,2,3,4,5} ： {2,1,3,4,5}
         *    第二次：{2,1,3,4,5} ： {2,3,1,4,5}
         *    第三次：{2,3,1,4,5} ： {2,3,4,1,5}
         *    第四次：{2,3,4,1,5} ： {2,3,4,5,1}
         */
        for (int j = ints.length - 1; j > 0 ; j--) {
            for (int i = 0; i < j; i++) {
                if (ints[i] < ints[i + 1]) {
                    int temp = 0;
                    temp = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(ints));
    }
}
