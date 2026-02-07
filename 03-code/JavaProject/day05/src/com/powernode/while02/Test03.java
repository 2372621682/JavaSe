package com.powernode.while02;

public class Test03 {
    public static void main(String[] args) {
        /**
         * 1.语法：
         *    1、定义循环变量
         *    2. while (<布尔表达式>){
         *        循环体;
         *    }
         * 2.执行过程：
         *    <布尔表达式>：
         *       1.true:执行循环体
         *       2.false:不执行循环体
         */
        //1.定义循环变量
        int i = 0;
        //2.编写循环语句
        while(i < 3){
            System.out.println("i = " + i);
            i++;
        }
        /**
         * 第一次循环：
         * 1.i = 0
         * 2.i < 3 : 0 < 3 : true
         * 3.System.out.println("i = " + i); i = 0
         * 4.i++; i = 1
         * 第二次循环：
         * 5.i < 3 : 1 < 3 : true
         * 6.System.out.println("i = " + i);i = 1
         * 7.i++; i = 2
         * 第三次循环：
         * 8.i < 3 ： 2 < 3 : true
         * 9.System.out.println("i = " + i);i = 2
         * 10.i++; i = 3
         * 第四次循环：
         * 11.i < 3 ： 3 < 3 :false ,结束了循环
         */
    }
}
