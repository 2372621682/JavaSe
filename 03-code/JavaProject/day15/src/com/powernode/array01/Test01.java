package com.powernode.array01;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] ints = {5, 4, 0, 2, 1};
        //1.假设第一个就是最小的
        int min = 0;
        for (int i = 0; i < 4; i++) {
            //2.最小的如果大于相邻的
            if (ints[min] > ints[i + 1]) {
                //3.相邻的就是最小的
                min = i + 1;
            }
        }
        //假设条件不成立，才交换位置
        if (min != 0) {
            //4.把最小的与第一个交换位置
            int temp = ints[0];
            ints[0] = ints[min];
            ints[min] = temp;
        }
        //[1, 4, 3, 2, 5]
        min = 1;//假设第二个就是最小的
        for (int i = 1; i < 4; i++) {
            if (ints[min] > ints[i+1]) {
                min = i +1 ;
            }
        }
        //假设条件不成立，才交换位置
        if (min != 1) {
            //4.把最小的与第2个交换位置
            int temp = ints[1];
            ints[1] = ints[min];
            ints[min] = temp;
        }


        min = 2;
        for (int i = 2; i < 4; i++) {
            if (ints[min] > ints[i+1]) {
                min = i +1 ;
            }
        }
        if (min != 2) {
            int temp = ints[2];
            ints[2] = ints[min];
            ints[min] = temp;
        }

        min = 3;
        for (int i = 3; i < 4; i++) {
            if (ints[min] > ints[i+1]) {
                min = i +1 ;
            }
        }
        if (min != 3) {
            int temp = ints[3];
            ints[3] = ints[min];
            ints[min] = temp;
        }
        System.out.println(Arrays.toString(ints));


    }
}
