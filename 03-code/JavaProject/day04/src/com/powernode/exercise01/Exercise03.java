package com.powernode.exercise01;

public class Exercise03 {
    public static void main(String[] args) {
        short s = 2;
        byte b = 3;
        //范围小的数据类型   变量名称 = (范围小的数据类型) 需要转换的数据
        byte b1 = (byte)(s + b);
        System.out.println(b1);
    }
}
