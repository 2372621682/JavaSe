package com.powernode.method03;

import com.sun.security.jgss.GSSUtil;

public class Test04 {
    public static void main(String[] args) {
        /*int x = square();
        System.out.println(x);*/
        System.out.println(square());
        //int num = method(); 方法没有返回值，不可以声明变量去接收
        //System.out.println(method());//无法解析方法‘println(void)’
    }
    //计算3的平方并返回
    public static int square(){
        return 3 * 3;
    }
    public static void method(){
        System.out.println(3 * 3);
    }
}
