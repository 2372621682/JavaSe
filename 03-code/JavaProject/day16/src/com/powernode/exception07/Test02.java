package com.powernode.exception07;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        /**
         * 语法：
         *    try{
         *        可能发生异常的代码
         *    }catch(异常类 异常对象){
         *        异常处理：比如输出一句友好提示
         *    }catch(异常类 异常对象){
         *        异常处理：比如输出一句友好提示
         *    }
         *
         *    catch执行（根据出现的异常决定的）
         *       1.从上到下依次执行
         *       2.上面捕获到了异常，就不会往下执行
         *       3.所以说:前面的异常范围 <=后面的异常范围
         */
        try{
            //NumberFormatException ,ArithmeticException
            int x = Integer.parseInt(args[0]);//接收字符串转换为整数，不需要掌握
            int y = Integer.parseInt(args[1]);

            int num = div(x ,y);
            System.out.println(num);

        }catch(ArithmeticException e){//ArithmeticException e = new ArithmeticException()
            System.out.println("除数不能为0");
        }catch (NumberFormatException e){
            System.out.println("字符串无法转换为整数");
        }

    }

    private static int div(int x, int y) {
        return x / y;
    }
}
