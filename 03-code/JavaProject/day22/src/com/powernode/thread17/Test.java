package com.powernode.thread17;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum+=i;
            System.out.println("i = " + i);
        }
        return sum;
    }
}
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.创建Callable接口的实现类
        MyThread myThread = new MyThread();
        //2.创建FutureTask对象，将Callable接口的实现类作为构造方法参数传入
        FutureTask<Integer> integerFutureTask = new FutureTask<>(myThread);
        //3.创建Thread对象，将FutureTask对象作为Thread的构造方法参数传入
        Thread thread = new Thread(integerFutureTask);
        //4.调用Thread对象的start()方法启动线程
        thread.start();
        //5.获取Callable接口的实现类的返回值
        /**
         * 1.如果线程执行到get方法，则会阻塞当前线程，直到获取到返回值
         * 2.这就是线程的阻塞特点(阻塞主线程）
         */
        Integer sum = integerFutureTask.get();
        System.out.println("sum = " + sum);
        for (int j = 0; j < 10; j++) {
            System.out.println("--j = " + j);
        }
    }
}
