package com.powernode.while02;

public class Test04 {
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
        //使用循环打印2行3列的*
        /*
           ***
           ***
        */
        int i = 0;
        while(i < 3){
            System.out.print("*");
            i++;
        }
        System.out.println();

        int j = 0;
        while(j < 3){
            System.out.print("*");
            j++;
        }
        System.out.println();
    }
}
