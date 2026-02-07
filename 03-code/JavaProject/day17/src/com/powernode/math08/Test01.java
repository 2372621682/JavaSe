package com.powernode.math08;

public class Test01 {
    public static void main(String[] args) {
        /**
         * public static double ceil(double a)	返回大于参数的最小整数（向上取整）
         * public static double floor(double a)	返回小于参数的最大整数（向下取整）
         * public static long round(double a)	返回四舍五入的整数
         * public static int max(int a, int b)	返回两个数的最大值
         * public static int min(int a, int b)	返回两个数的最小值
         * public static int abs(int a)	获取a的绝对值
         * public static double pow(double a, double b)	获得a的b次方
         * public static double sqrt(double a)	对a执行开平方的操作
         * public static double random()	获得[0.0, 1.0)之间的随机小数
         */
        System.out.println(Math.ceil(2.1));//3.0,舍小数，进1（向上取整）
        System.out.println(Math.floor(2.9));//2.0,舍小数（向下取整）
        System.out.println(Math.round(2.5));//3
        System.out.println(Math.max(2, 3));
        System.out.println(Math.min(2, 3));
        System.out.println(Math.abs(-3));//3
        System.out.println(Math.pow(2, 3));//8
        System.out.println(Math.sqrt(9));//3
        System.out.println(Math.random());
    }
}
