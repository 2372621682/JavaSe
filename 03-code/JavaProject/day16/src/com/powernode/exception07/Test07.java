package com.powernode.exception07;

public class Test07 {
    public static void main(String[] args) {
        try {
            int num = div(10,0);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
            //System.exit(0);//终止JVM,可以理解为关机，后面还可以处理资源
            Runtime.getRuntime().halt(0);//终止JVM，可以理解为断点，后面不可以处理资源
        } finally {
            System.out.println("=====finally不会执行=====");
        }
    }

    private static int div(int x, int y) {
        return x / y;
    }

}
