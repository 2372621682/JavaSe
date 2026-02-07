package com.powernode.string03;

public class Test01 {
    public static void main(String[] args) {
        //1.==
        String s1 = "123";
        String s2 = "123";
        /**
         * 字符串常量池
         *   1.s1 = "123"
         *   2.首先去常量池中找有没有字符串123
         *   3.如果有拿来使用
         *   4.如果没有创建字符串“123”，创建后放入常量池
         *   5.s2 = "123",在常量池中找到了字符串“123”
         *   6.所以 s1 == s2 ,同一块内存
         */
        System.out.println(s1 == s2);//true
        //强制开辟了新的空间存储123，不去常量池中取
        String s3 = new String("123");
        System.out.println(s1 == s3);//false
        System.out.println("=================");
        //2.hashCode是否相等
        System.out.println(s1.hashCode() == s2.hashCode());//true
        System.out.println(s2.hashCode() == s3.hashCode());//true
        //3.物理hash：因为s1 和 s2 是同一块内存，s3新开辟的内存，字符串重写了hashCode,无法覆盖物理hash值
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
    }
}
