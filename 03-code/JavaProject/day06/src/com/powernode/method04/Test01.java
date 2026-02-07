package com.powernode.method04;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 1.continue,break,return
         *    1.continue:
         *      1.含义：继续，结束当前当次循环，继续下一次循环
         *      2.在哪里使用：循环
         *    2.break
         *      1.含义：终止或者中断
         *      2.在哪里使用：
         *         1.分支语句：表示结束分支语句
         *         2.循环：结束循环
         *    3.return
         *      1.含义：返回
         *      2.在方法中使用
         *        1.返回一个结果给调用者，并结束方法
         *        2.不返回任何信息结束方法
         * 2.三个关键字后都不可以写任何语句，因为没有机会执行
         *
         */
        testContinue();//结束一次循环
        testBreak();//结束整个循环
        testReturn();//结束整个方法
    }

    public static void testContinue() {
        //输出【1-6】之间2的倍数
        for (int i = 1; i <= 6; i++) {
            if (i % 2 != 0) {
                continue;//结束当前当次循环，继续下一次循环
            }
            System.out.println("i = " + i);
        }
        System.out.println("----------------");
    }
    public static void testBreak() {
        //输出【1-6】之间2的倍数
        for (int i = 1; i <= 6; i++) {
            if (i % 2 != 0) {
                break;//结束循环
            }
            System.out.println("i = " + i);
        }
        System.out.println("----------------");
    }
    public static void testReturn() {
        //输出【1-6】之间2的倍数
        for (int i = 1; i <= 6; i++) {
            if (i % 2 != 0) {
                return;//结束方法
            }
            System.out.println("i = " + i);
        }
        System.out.println("----------------");
    }
}
