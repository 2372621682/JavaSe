package com.powernode.thread14;

public class Test {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
        //3.调用start方法开启多线程
        thread.start();

        for (int j = 0; j < 10; j++) {
            System.out.println("--j = " + j);
        }
    }
}
