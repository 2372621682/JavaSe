package com.powernode.exception07;

public class Test03 {
    public static void main(String[] args) {


        try{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            int num = div(x ,y);
            System.out.println(num);

        }catch(ArithmeticException | NumberFormatException e){
            System.out.println("异常信息：" + e.getMessage());
        }

    }

    private static int div(int x, int y) {
        return x / y;
    }
}
