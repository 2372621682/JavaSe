package com.powernode.string03;

public class Test02 {
    public static void main(String[] args) {
        String s1 = "123";
        System.out.println(System.identityHashCode(s1));
        s1 = "456";
        System.out.println(System.identityHashCode(s1));
        /**
         * String是final的
         *    1.对字符串的修改，不是改变了值
         *    2.而是开辟了新的空间，给与新的内存地址
         */
    }
}
