package com.powernode.method03;

public class Test01 {
    public static void main(String[] args) {
        //方法名称();
        add();
    }
    //[修饰符] 返回类型 方法名称([形参类别]){方法体;}
    //定义一个方法计算 3 + 2 的结果并输出
    public static void add(){
        int x = 2, y = 3;
        int z = x + y;
        System.out.println("z = " + z);
    }
}
