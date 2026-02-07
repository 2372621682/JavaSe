package com.powernode.for04;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 1.语法：
         *    for(<循环变量初始化>;<判断循环变量>;<修改循环变量>){
         *        循环体;
         *    }
         */
        /*int i = 0;
        while(i < 3){
            System.out.println("i = " + i);
            i++;
        }*/
        for(int i = 0;i < 3;i++){
            System.out.println("i = " + i);
        }
        /**
         * 第一次循环
         * 1.int i = 0
         * 2.i < 3 ： 0 < 3 : true
         * 3.System.out.println("i = " + i); i = 0
         * 第二次循环
         * 4.i++ : i = 1
         * 5.i < 3 ：1 < 3 : true
         * 6.System.out.println("i = " + i); i = 1
         * 第三次循环
         * 7.i++ : i = 2
         * 8.i < 3 : 2 < 3 :true
         * 9.System.out.println("i = " + i); i = 2
         * 第四次循环
         * 10.i++ : i = 3
         * 11.i < 3 ： 3 < 3 :false ：结束循环
         */
    }
}
