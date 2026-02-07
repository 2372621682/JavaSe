package com.powernode.string03;

public class Test05 {
    public static void main(String[] args) {
        /**
         * 常量池中有几个对象
         *    1."abc"
         *    2."abcdef"
         */
        //s1 = "abc" ,final修饰了s1，不可以改变值
        final String s1 = "abc";//创建对象abc
        //因为s1常量，因此【s1 + "def"】也是在编译期完成拼接，底层不会创建StringBuilder对象
        //创建对象放入常量池
        String s2 = s1 + "def";
        System.out.println(System.identityHashCode(s2));
        //s3从常量池取"abcdef"
        String s3 = "abcdef";
        System.out.println(System.identityHashCode(s3));
        System.out.println(s2 == s3);//true
    }
}
