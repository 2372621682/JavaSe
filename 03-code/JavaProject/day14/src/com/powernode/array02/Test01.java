package com.powernode.array02;

public class Test01 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6};
        /**
         * 1.删除下标为 3 的元素 4
         * 2.删除后的结果为：{1, 2, 3, 5, 6};
         * 3.删除步骤：
         *    1.创建一个新的数组，长度为老数组长度 - 1
         *       {0, 0, 0, 0, 0};
         *    2.把数组的前3个元素放入新数组
         *       {1, 2, 3, 0, 0};
         *    3.把数组的后2个元素放入新数组
         *       {1, 2, 3, 5, 6};
         */
        //1.创建一个新的数组，长度为老数组长度 - 1
        int[] newInts = new int[ints.length - 1];
        //2.把数组的前3个元素放入新数组
        System.arraycopy(ints,0,newInts,0,3);
        //3.把数组的后2个元素放入新数组
        System.arraycopy(ints,4,newInts,3,2);
        for (int newInt : newInts) {
            System.out.print(newInt + "\t");
        }
    }
}
