package com.powernode.api13;

public class Test02 {
    public static void main(String[] args) {
        int i1 = 123;
        System.out.println("i1 = " + i1);
        int i2 = 123;
        System.out.println("i2 = " + i2);
        System.out.println(i1 == i2);//true
        System.out.println("=============");
        /**
         * 1.Integer类加载的时候会执行IntegerCache中的静态块
         * 2.IntegerCache静态快中，会值自动创建一个长度为256的Integer数组
         * 3.Integer[] c = new Integer[size];//创建了长度为256的Integer数组
         *     for(int i = 0; i < c.length; i++) {
         *         c[i] = new Integer(j++);
         *         //c[0] = new Integer(-128)
         *         //c[1] = new Integer(-127)
         *         //把-128到127存储到Integer数组中
         *    }
         * 4.创建完毕会把数组放入cache中（static final Integer[] cache;//缓存）
         * 5.cahe是static常量，所以引用在元空间，对象在堆中，我们也称为静态常量池
         * 6.Java创建Integer对象时，首先从静态常量池中取，如果没有才创建，如果有直接用
         *
         *
         */
        Integer i3 = 123;
        System.out.println("i3 = " + i3);
        Integer i4 = 123;
        System.out.println("i4 = " + i4);
        System.out.println(i3 == i4);//true
        System.out.println("---------------");

        Integer i5 = 128;
        System.out.println("i5 = " + i5);
        Integer i6 = 128;
        System.out.println("i6 = " + i6);
        System.out.println(i5 == i6);//false

    }
}
