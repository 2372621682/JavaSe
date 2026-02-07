package com.powernode.array21;

public class Test02 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        /**
         * 1.长度不够用了，对数组进行扩容
         * 2.扩容的思路
         *    1.创建一个新的数组，长度是老数组的2倍
         *    2.把老数组的数据取出来，放入新数组
         */
        //1.创建一个新的数组，长度是老数组的2倍
        int[] newInts = new int[ints.length << 2];//扩容2倍
        //2.把老数组的数据取出来，放入新数组
        for (int i = 0; i < ints.length; i++) {
            newInts[i] = ints[i];
        }
        //把老数组的引用指向新数组的地址
        ints = newInts;
    }


}
