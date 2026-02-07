package com.powernode.array02;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {

        /**
         * 1.删除下标为 3 的元素 4
         * 2.删除后的结果为：{1, 2, 3, 5, 6};
         * 3.删除步骤：
         *    1.把老数组的后两位往前挪一位
         *       {1, 2, 3, 5, 6, 6};
         *    2.把老数组的前5位，复制到新数组中：{1, 2, 3, 5, 6};
         */
        int[] ints = {1, 2, 3, 4, 5, 6};
        //1.把老数组的后两位往前挪一位
        System.arraycopy(ints,4,ints,3,2);
        //2.把老数组的前5位，复制到新数组中：{1, 2, 3, 5, 6};
        /**
         * 学习方法的方法：
         *   1.是否为静态 ： staitc
         *   2.返回类型 ： int[]
         *   3.参数列表：
         *      int[] original ： 源数组
         *      int newLength ： 需要复制的元素个数（新数组的长度）
         */
        ints = Arrays.copyOf(ints, 5);
        for (int anInt : ints) {
            System.out.print(anInt + "\t");
        }
    }


}
