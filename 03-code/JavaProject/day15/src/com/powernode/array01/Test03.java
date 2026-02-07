package com.powernode.array01;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5};
        for (int j = 0; j < 4; j++) {
            //1.假设第一个就是最大的（max)
            int max = j;
            for (int i = j; i < 4; i++) {
                //2.最大的如果小于相邻的
                /**
                 * 原理：{1,2,3,4,5}
                 *   1.从待排序数组中找到最大元素下标
                 *      1.假设第一个就是最大的（max)
                 *      2.拿到最大的与之相邻的进行比较
                 *      3.最大的 < 相邻的
                 *      4.那么相邻的就是最大的
                 *   2.把最大的与第一个交换位置
                 */
                if (ints[max] < ints[i + 1]) {
                    //3.相邻的就是最大的
                    max = i + 1;
                }
            }
            //假设条件不成立，才交换位置
            if (max != j) {
                //4.把最大的与第一个交换位置
                int temp = ints[j];
                ints[j] = ints[max];
                ints[max] = temp;
            }
        }
        System.out.println(Arrays.toString(ints));


    }
}
