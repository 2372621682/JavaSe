package com.powernode.thread12;

/**
 * 1.编写线程类
 *   1.继承Thread类
 *   2.重写run方法
 */
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        //1.创建线程类对象
        MyThread myThread = new MyThread();
        //2.启动线程
            //1.调用start方法启动线程（会通知run方法执行）
            //2.通知后，线程会继续往下执行
        myThread.start();//通知run方法开始执行，通知完毕start方法就执行完毕了，程序会继续往下执行，不会等run方法执行完毕
        //myThread.run();//普通的方法调用，需要等待run方法执行完毕，程序才会继续往下执行

        for (int j = 0; j < 10; j++) {
            System.out.println("--j = " + j);
        }
    }
}
