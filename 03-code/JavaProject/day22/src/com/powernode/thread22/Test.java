package com.powernode.thread22;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }
}
public class Test {
    public static void main(String[] args) throws Exception{
        MyThread myThread = new MyThread("线程1");
        myThread.start();
        for (int j = 0; j < 10; j++) {
            System.out.println("--j = " + j);
            /**
             * 1.yield()方法，提示CPU当前线程由运行状态切换到就绪状态
             * 2.yield()方法，当前线程属于就绪状态，CPU调动时，仍然有可能调度到它
             */
            Thread.yield();
            //Thread.sleep(1000);线程睡眠1秒
        }
    }
}
