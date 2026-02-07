package com.powernode.thread13;

/**
 * 1.实现Runnable接口
 * 2.重写run方法
 */
class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        //1.创建Runnable接口的实现类
        MyThread myThread = new MyThread();
        //2.创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread thread = new Thread(myThread);
        //3.调用start方法开启多线程
        thread.start();

        for (int j = 0; j < 10; j++) {
            System.out.println("--j = " + j);
        }
    }
}
