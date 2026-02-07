package com.powernode.exception09;
class UserArithmeticException extends Exception{

}
public class Test {
    public static void main(String[] args) {
        try {
            div(5, 0);
        } catch (UserArithmeticException e) {
            throw new RuntimeException(e);
        }
    }

    private static void div(int x, int y)throws UserArithmeticException {
        /*try {
            System.out.println(x / y );
        } catch (ArithmeticException e) {
            throw new UserArithmeticException();//把系统的异常，转换为自定义异常
        }*/
        if (y == 0) {
            throw new UserArithmeticException();
        }
        System.out.println(x / y);
    }
}
