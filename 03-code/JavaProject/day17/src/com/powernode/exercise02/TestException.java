package com.powernode.exercise02;
class IlleagalNumberException extends Exception{
    public IlleagalNumberException() {
    }

    public IlleagalNumberException(String message) {
        super(message);
    }

    public IlleagalNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public IlleagalNumberException(Throwable cause) {
        super(cause);
    }

    public IlleagalNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
public class TestException {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (IlleagalNumberException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int divide(int m,int n)throws IlleagalNumberException{
        if (n == 0)
            throw new IlleagalNumberException("除数不能为0");
        return m / n;
    }
}
