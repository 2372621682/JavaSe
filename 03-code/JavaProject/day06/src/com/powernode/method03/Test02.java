package com.powernode.method03;

public class Test02 {
    public static void main(String[] args) {
        //方法名称([实参列表]);
        add(10,20);
    }
    //[修饰符] 返回类型 方法名称([形参类别]){方法体;}
    //定义一个方法:计算任意的两个整数相加
    //什么时候需要定义形参：方法内部，需要用到外界传入的数据，可以使用形参来接收
    public static void add(int x ,int y){//定义形参，用来接收两个整数
        int z = x + y;
        System.out.println("z = " + z);
    }
}
