package com.powernode.array19;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 1.数组的动态初始化
         *     1.语法：数据类型 [] 数组名称 = new 数据类型[长度]
         *     2.数据类型：基本类型和引用类型
         *     3.长度：存储元素的个数
         * 2.注意：动态初始化必须为数组指定长度
         */
        //Array initializer expected 期望数组初始化项
        int[] ints = new int[3];
        System.out.println(ints);

        System.out.println(ints[0]);
        System.out.println(ints[1]);
        System.out.println(ints[2]);
    }
}
