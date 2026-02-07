package com.powernode.array21;

public class Test03 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        /**
         * 1.System.arraycopy():JDK提供的方法
         * 2.学习方法的方法
         *    1.是否为静态
         *    2.返回类型
         *    3.方法参数：
         *       1.Object src ：源数组
         *       2.int  srcPos：源数组的起始位置
         *       3.Object dest：目标数组
         *       4.int destPos：目标数组的起始位置
         *       5.int length：需要赋值的元素个数
         */
        int[] newInts = new int[ints.length << 1];
        //
        System.arraycopy(ints,0,newInts,0,ints.length);
        ints = newInts;
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }


}
