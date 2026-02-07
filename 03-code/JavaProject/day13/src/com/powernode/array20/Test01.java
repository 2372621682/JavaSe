package com.powernode.array20;

public class Test01 {
    public static void main(String[] args) {
        //1.数组静态初始化
        int[] ints = {1, 2, 3};
        System.out.println("ints[0] = " + ints[0]);
        System.out.println("ints[1] = " + ints[1]);
        System.out.println("ints[2] = " + ints[2]);
        /**
         * 2.什么情况下，使用动态初始化，什么情况下使用动态初始化
         *     1.一般情况下确定了值，使用静态初始化
         *     2.一般情况下确定了长度，不确定值，使用动态初始化
         */
        char[] chars = {'a', 'b', 'c'};
        char[] chars1 = new char[3];
        chars1[0] = 'a';
        chars1[1] = 'a';
        chars1[2] = 'a';
        //3.引用类型数组
        String[] strings = {"abc", "def", "xyz"};

        Object[] objects = new String[3];
        objects[0] = "abc";
    }

}
