package com.powernode.method04;

public class Test03 {
    public static void main(String[] args) {
        /**
         * 1.方法调用：其实就是实参给形参赋值：
         * 2.匹配规则：
         *     1.数据类型：精确匹配
         *     2.数据类型：从   小  到    大
         */
        add(2,3);
    }
   /* public static void add(int x ,int y){
        System.out.println("Test03.add(int x ,int y)");
    }*/
    public static void add(float x ,float y){
        System.out.println("Test03.add(float x ,float y)");
    }
    public static void add(double x ,double y){
        System.out.println("Test03.add(double x ,double y)");
    }

    /**
     * 1.如下代码注释掉，报错
     * 2.java对add方法的调用不明确
     *    add(float x ,float y) 和 add (int x ,double y)
     *    jvm分不清应该调用谁
     */
    public static void add(int x ,float y){
        System.out.println("Test03.add(int x ,float y)");
    }
    public static void add(int x ,double y){
        System.out.println("Test03.add(int x ,double y)");
    }



}
