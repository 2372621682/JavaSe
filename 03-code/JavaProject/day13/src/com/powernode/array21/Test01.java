package com.powernode.array21;

public class Test01 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        changeArray(ints);
        System.out.println(ints[1]);//6
    }

    public static void changeArray(int[] ints) {
        ints[1] = 6;
    }
}
