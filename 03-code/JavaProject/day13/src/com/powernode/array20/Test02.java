package com.powernode.array20;

public class Test02 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3,8};
        System.out.println("ints[0] = " + ints[0]);
        System.out.println("ints[1] = " + ints[1]);
        System.out.println("ints[2] = " + ints[2]);
        System.out.println("------------");
        /**
         * 1.数组对象有一个隐含的属性：length
         * 2.通过length可以获得数组的长度（可存储元素的个数）
         */
        System.out.println("ints.length = " + ints.length);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }

}
