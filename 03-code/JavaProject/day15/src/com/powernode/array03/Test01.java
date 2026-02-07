package com.powernode.array03;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] ints = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int index = Arrays.binarySearch(ints, 0, 9, 50);
        /**
         * public static String toString(int[] a)	将数组转换为字符串拼接
         * public static int[] copyOf(int[] original, int newLength)	将数组扩容（original : 第一个参数需要扩容的数组，length：第二个参数，复制的长度）
         * public static int[] copyOfRange(int[] original, int from, int to) 	将数组扩容到某个范围（original：第一个参数为要拷贝的数组对象，from：第二个参数为拷贝的开始位置（包含）to：第三个参数为拷贝的结束位置（不包含））
         * public static void sort(int[] a) 	 数组升序排序
         * public static int binarySearch(int[] a, int key)	数组的查找（ a 要搜索的数组， key要查找的值）
         * public static void fill(int[] a, int val)	想数组填充数据（a : 被填充的数组 ，val：填充的数据）
         */
        System.out.println(Arrays.toString(ints));
        ints =new int[] {1,2,3,0,5};//静态初始化，为数组重新赋值
        Arrays.sort(ints);//数组升序排序 ：[0, 1, 2, 3, 5]
        Arrays.fill(ints,8);//[8, 8, 8, 8, 8]

        ints = new int[]{5, 4, 0, 2, 1};
        //int[] newInts = Arrays.copyOf(ints, ints.length << 1);
        int[] newInts = Arrays.copyOf(ints, ints.length >> 1);//[5, 4]

        int[] ints1 = Arrays.copyOfRange(ints, 1, 3);//[1,3):4,0
        System.out.println(Arrays.toString(ints1));

    }
}
