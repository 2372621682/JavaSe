package com.powernode.thread15;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        return 0;
    }
}
public class Test {
    public static void main(String[] args) {
        //1.创建Callable接口的实现类
        MyThread myThread = new MyThread();
        //2.创建FutureTask对象，将Callable接口的实现类作为构造方法参数传入
        FutureTask<Integer> integerFutureTask = new FutureTask<>(myThread);
        //3.创建Thread对象，将FutureTask对象作为Thread的构造方法参数传入
        Thread thread = new Thread(integerFutureTask);
        //4.调用Thread对象的start()方法启动线程
        thread.start();

        for (int j = 0; j < 10; j++) {
            System.out.println("--j = " + j);
        }
    }
}
