package com.powernode.thread18;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return 5 / 0;
    }
}
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        FutureTask<Integer> integerFutureTask = new FutureTask<Integer>(myThread);
        new Thread(integerFutureTask).start();

        try {
            /**
             * 1.integerFutureTask.get();可以获得call方法的返回值
             * 2.call方法会抛出异常
             * 3.call方法抛出的异常会被封装成ExecutionException
             * 4.所以调用get方法时，必须处理ExecutionException
             * 5.get方法也会抛出InterruptedException（后面将）
             */
            Integer num = integerFutureTask.get();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        } catch (ExecutionException e) {
            System.out.println("ExecutionException");

        }
    }
}
