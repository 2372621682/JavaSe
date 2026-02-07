package com.powernode.string03;

public class Test04 {
    public static void main(String[] args) {
        //如下程序创建了几个对象
        //1.创建x对象放入常量池
        String s1 = "x";
        //2.+ 底层创建一个StringBuilder对象进行拼接
        //3.创建y对像放入常量池
        //4.拼接后的StringBuilder对象，转换为String对象（s2),s2不放入常量池，因为s2拼接的是变量
        String s2 = s1 + "y";
        //5.创建xy对象放入常量池
        String s3 = "xy";
        System.out.println(s2 == s3);//false
    }
}
