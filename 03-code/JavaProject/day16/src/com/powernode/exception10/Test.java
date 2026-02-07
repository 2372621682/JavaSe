package com.powernode.exception10;
class UserArithmeticException extends Exception{
    public UserArithmeticException(String message) {
        super(message);
    }

    public UserArithmeticException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserArithmeticException(Throwable cause) {
        super(cause);
    }

    public UserArithmeticException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public UserArithmeticException() {
    }
}
public class Test {
    public static void main(String[] args) {
        try {
            div(5, 0);
        } catch (UserArithmeticException e) {
            e.printStackTrace();//打印堆栈信息
            System.out.println("异常信息：" + e.getMessage());
        }
    }

    private static void div(int x, int y) throws UserArithmeticException {
        try {
            System.out.println(x / y );
        } catch (ArithmeticException e) {
            throw new UserArithmeticException("除数不能0",e);//把系统封装为自定义异常
        }
    }
}
