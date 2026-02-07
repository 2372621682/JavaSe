package com.powernode.thread19;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread01 extends Thread {
    public MyThread01(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }
}
class MyThread02 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }
}
class MyThread03 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        return -1;
    }
}
public class Test {
    public static void main(String[] args) {
        //1.获得线程的名称和状态
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());//获得线程名称
        System.out.println(thread.getState());//获得线程状态

        //方式一
        MyThread01 myThread01 = new MyThread01("T1");
        System.out.println(myThread01.getName());
        System.out.println(myThread01.getState());
        //方式二
        MyThread02 myThread02 = new MyThread02();
        Thread thread1 = new Thread(myThread02, "T2");
        System.out.println(thread1.getName());
        System.out.println(thread1.getState());

        //方式三
        MyThread03 myThread03 = new MyThread03();
        FutureTask<Integer> integerFutureTask = new FutureTask<Integer>(myThread03);
        Thread thread2 = new Thread(integerFutureTask, "T3");
        System.out.println(thread2.getName());
        System.out.println(thread2.getState());
    }
}
