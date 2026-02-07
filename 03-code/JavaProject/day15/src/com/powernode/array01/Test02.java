package com.powernode.array01;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        int[] ints = {5, 4, 0, 2, 1};
        for (int j = 0; j < 4; j++) {
            //1.假设第一个就是最小的
            int min = j;
            for (int i = j; i < 4; i++) {
                //2.最小的如果大于相邻的
                if (ints[min] > ints[i + 1]) {
                    //3.相邻的就是最小的
                    min = i + 1;
                }
            }
            //假设条件不成立，才交换位置
            if (min != j) {
                //4.把最小的与第一个交换位置
                int temp = ints[j];
                ints[j] = ints[min];
                ints[min] = temp;
            }
        }
        System.out.println(Arrays.toString(ints));


    }
}
