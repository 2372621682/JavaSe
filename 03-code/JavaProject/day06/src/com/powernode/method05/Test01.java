package com.powernode.method05;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 1.需求：3!
         *   3! = 3 * 2 * 1
         *   0! = 1
         *   1!= 1
         * 2.递归：
         *   1.方法内部调用方法自己
         *   2.优点：代码简洁
         *   3.缺点：耗费内存
         * 3.递归可以理解为循环的一种替代形式
         */
        int factorial = factorial(3);
        System.out.println("factorial = " + factorial);
    }
    public static int factorial(int x){
        if (x == 1 || x == 0) {
            return 1;
        }
        return x * factorial(x - 1);
    }

}
