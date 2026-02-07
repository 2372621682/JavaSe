package com.powernode.exception07;

import java.util.concurrent.locks.ReentrantLock;

public class Test05 {
    public static void main(String[] args) {

        /**
         * 语法：
         *    try{
         *        可能发生异常的代码
         *    }finally{
         *        最终会中的代码
         *    }
         *    在多线程场景中使用锁（如 ReentrantLock）时，finally 可确保锁被释放，避免死锁。
         */
        ReentrantLock lock = new ReentrantLock();
        try {
            lock.lock(); // 获取锁
            // 执行需要同步的操作（可能抛出异常）
        } finally {
            lock.unlock(); // 无论如何都释放锁
        }
    }
    /**
     * try-catch 可以组队出现
     * try-finally 可以组队出现
     * try-catch-finally 可以组队出现
     */


}
