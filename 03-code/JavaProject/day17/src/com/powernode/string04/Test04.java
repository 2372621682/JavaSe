package com.powernode.string04;

public class Test04 {
    public static void main(String[] args) {
        /**
         * String trim()	去除首,尾空格
         * String strip()	去除首,尾空格，Java 11中引入了strip()方法作为trim()的替代品
         * String stripLeading()	去除首空格
         * String stripTrailing()	去除尾空格
         * replace(" ","")	去除所有空格
         * replace(" ","FF")	把空格替换为FF
         */
        String s = "  abc  ";
        System.out.println("--" + s + "--");
        System.out.println("--" + s.trim() + "--");
        System.out.println("--" + s.strip() + "--");
        System.out.println("--" + s.stripLeading() + "--");
        System.out.println("--" + s.stripTrailing() + "--");

        s = "  a bc  ";
        System.out.println("--" + s + "--");
        System.out.println(s.replace(" ", ""));
        System.out.println(s.replace(" ", "FF"));
        /**
         * --  abc  --
         * --abc--
         * --abc--
         * --abc  --
         * --  abc--
         * --  a bc  --
         * abc
         * FFFFaFFbcFFFF
         */
    }
}
