package com.powernode.array15;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        //冒泡：大的在后面
        int[] ints = {5,4,3,2,1};
        for (int i = 0; i < 4; i++) {
            if (ints[i] > ints[i + 1]) {
                int temp = 0;
                temp = ints[i];
                ints[i] = ints[i + 1];
                ints[i + 1] = temp;
            }
        }
        //[4, 3, 2, 1, 5],下一轮5不参与
        for (int i = 0; i < 3; i++) {
            if (ints[i] > ints[i + 1]) {
                int temp = 0;
                temp = ints[i];
                ints[i] = ints[i + 1];
                ints[i + 1] = temp;
            }
        }
        //[3, 2, 1, 4, 5] ,下一轮4不参与
        for (int i = 0; i < 2; i++) {
            if (ints[i] > ints[i + 1]) {
                int temp = 0;
                temp = ints[i];
                ints[i] = ints[i + 1];
                ints[i + 1] = temp;
            }
        }
        //[2, 1, 3, 4, 5],下一轮3不参与
        for (int i = 0; i < 1; i++) {
            if (ints[i] > ints[i + 1]) {
                int temp = 0;
                temp = ints[i];
                ints[i] = ints[i + 1];
                ints[i + 1] = temp;
            }
        }
        //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(ints));
    }
}
