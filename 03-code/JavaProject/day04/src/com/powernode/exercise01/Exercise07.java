package com.powernode.exercise01;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        /**
         * 语法：<条件表达式>?<表达式1>:<表达式2>
         * 执行过程：
         *     1.<条件表达式>
         *         1.true : 返回<表达式1>的结果
         *         2.false : 返回<表达式2>的结果
         *
         */
        int x = 2;
        int y = 3;
        int min = x < y ? x :y;
        System.out.println("min = " + min);
        System.out.println(10/0);
    }
}
