package com.powernode.array15;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        //冒泡：大的在后面
        int[] ints = {6, 1};
        /**
         * 如果第一个数 > 第二个数
         *    交换位置
         */
        if (ints[0] > ints[1]) {//A盆：ints[0]，B盆：ints[1]
            int temp = 0;//C盆
            temp = ints[0];//把A盆导入C盆，A空
            ints[0] = ints[1];//把B盆导入A盆，B空
            ints[1] = temp;//把C盆导入B盆，C空
        }
        System.out.println(Arrays.toString(ints));
    }
}
