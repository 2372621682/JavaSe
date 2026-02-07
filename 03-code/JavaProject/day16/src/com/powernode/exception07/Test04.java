package com.powernode.exception07;

public class Test04 {
    public static void main(String[] args) {

        /**
         * 语法：
         *    try{
         *        可能发生异常的代码
         *    }catch(异常类 异常对象){
         *        异常处理：比如输出一句友好提示
         *    }
         *    ...
         *    finally{
         *        最终会中的代码
         *    }
         */
        try{
            int x = 10;
            int y = 1;
            int num = div(x ,y);
        }catch(ArithmeticException e){
            System.out.println("异常信息：" + e.getMessage());
        }finally {
            System.out.println("无论try执行，还是catch执行，finally都会执行");
        }

    }

    private static int div(int x, int y) {
        return x / y;
    }
}
