package com.powernode.exception08;

public class Test02 {
    public static void main(String[] args) {
        div(5, 0);
    }

    private static void div(int x, int y) {
       /* try {
            System.out.println(x / y );
        } catch (ArithmeticException e) {
            throw new ArithmeticException();//上报
        }*/
        //先判断再执行的写法（第二种）效率更高，因为它避免了异常处理的额外开销。
        if (y == 0) {
            throw new ArithmeticException();//上报
        }
        System.out.println(x / y );
    }

}
