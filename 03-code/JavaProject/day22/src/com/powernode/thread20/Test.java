package com.powernode.thread20;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            try {
                /**
                 * 1.给当前线程指定睡眠时间，让当前线程进入阻塞
                 * 2.睡眠时间结束，当前线程进入就绪状态
                 * 3.由CPU调度，由就绪状态的线程进入运行状态
                 * 4.由运行状态的线程执行完毕，进入阻塞状态
                 * 备注：单位为毫秒，1秒 = 1000毫秒
                 */
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Test {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        for (int j = 0; j < 10; j++) {
            System.out.println("--j = " + j);
        }
    }
}
