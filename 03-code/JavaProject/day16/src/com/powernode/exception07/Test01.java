package com.powernode.exception07;

public class Test01 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        /**
         * 语法：
         *    try{
         *        可能发生异常的代码
         *    }catch(异常类 异常对象){
         *        异常处理：比如输出一句友好提示
         *    }
         */
        try{
            //y = 0 ，会发生
            //JVM自动创建一个异常对象，new ArithmeticException()
            int num = div(x,y);
            //catch是怎么捕获到异常：JVM创建的异常对象，才catch中的对象赋值，如果赋值成功就可以捕获到
        }catch(ArithmeticException e){//ArithmeticException e = new ArithmeticException()
            System.out.println("除数不能为0");
        }
    }

    private static int div(int x, int y) {
        return x / y;
    }
}
