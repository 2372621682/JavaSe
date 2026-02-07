package com.powernode.bufferandbuilder05;

public class Test03 {
    public static void main(String[] args) {
        int count = 150000;
        testString(count);
        testStringBuffer(count);
        testStringBuilder(count);
        /**
         * String耗时：6209毫秒
         * StringBuffer耗时：5毫秒
         * StringBuilder耗时：4毫秒
         */
    }

    private static void testString(int count) {
        String s = new String();
        //1.开始计时
        long start = System.currentTimeMillis();//获得时间的毫秒数
        //2.字符串处理
        for (int i = 0; i < count; i++) {
            s += i;
        }
        //3.结束计时
        long end = System.currentTimeMillis();//获得时间的毫秒数
        //4.耗时：结束时间 - 开始时间
        System.out.println("String耗时：" + (end - start) + "毫秒");
    }
    //线程安全，效率较低
    private static void testStringBuffer(int count) {
        StringBuffer sb = new StringBuffer();
        //1.开始计时
        long start = System.currentTimeMillis();//获得时间的毫秒数
        //2.字符串处理
        for (int i = 0; i < count; i++) {
            sb.append(i);
        }
        //3.结束计时
        long end = System.currentTimeMillis();//获得时间的毫秒数
        //4.耗时：结束时间 - 开始时间
        System.out.println("StringBuffer耗时：" + (end - start) + "毫秒");
    }
    //非线程安全，效率较高
    private static void testStringBuilder(int count) {
        StringBuilder sb = new StringBuilder();
        //1.开始计时
        long start = System.currentTimeMillis();//获得时间的毫秒数
        //2.字符串处理
        for (int i = 0; i < count; i++) {
            sb.append(i);
        }
        //3.结束计时
        long end = System.currentTimeMillis();//获得时间的毫秒数
        //4.耗时：结束时间 - 开始时间
        System.out.println("StringBuilder耗时：" + (end - start) + "毫秒");
    }
}
