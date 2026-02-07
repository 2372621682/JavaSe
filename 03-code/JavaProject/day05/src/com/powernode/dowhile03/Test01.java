package com.powernode.dowhile03;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 1.语法：
         *    do{
         *        循环体;
         *    }while(<布尔表达式>);
         * 2.执行过程：
         *   1.循环体;
         *   2.<布尔表达式>
         *        1.true:循环体;
         *        2.false:结束循环
         */
        int i = 0;
        do{
            System.out.println("i = " + i);
        }while(i++ <2);
        System.out.println("i = " + i);
        /**
         * 第一次循环：
         * 1.i = 0
         * 2.System.out.println("i = " + i); i = 0
         * 3.i++ <2
         *   1.i < 2 : 0 < 2 : true
         *   2.i++ : i = 1
         * 第二次循环
         * 4.System.out.println("i = " + i); i= 1
         * 5.i++ <2
         *   1.i < 2 : 1 < 2 : true
         *   2.i++ : i = 2
         * 第三次循环
         * 6.System.out.println("i = " + i); i = 2
         * 7.i++ <2
         *   1.i < 2 : 2 < 2 :false
         *   2.i++ : i = 3 //会执行
         */

    }
}
