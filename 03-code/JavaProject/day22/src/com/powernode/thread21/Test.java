package com.powernode.thread21;
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("线程启动了");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("线程睡眠被中断了");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        t.interrupt();//唤醒正在睡眠的线程
    }
}
