package com.powernode.string04;

import java.io.UnsupportedEncodingException;

public class Test01 {
    public static void main(String[] args) throws Exception {
        /**
         * String()	创建空String对象
         * String(String original)	指定字符串创建对象
         * String(byte[] bytes, String charsetName)	按照指定字符集编码创建String对象。
         * String(char[] value)	通过字符数组创建一个字符串对象
         */
        String s1 = new String();
        /*String s2 = new String("你好");
        byte[] bytes = s2.getBytes();//获得字节数组
        //UTF-8,utf-8,utf8,UTF8,国际编码，代表的是一个意思*/
        String s3 = new String("你好".getBytes(), "UTF-8");
        System.out.println(s3);

        //GBK,gbk,GB2312,GB18030,代表都是中文编码
        String s4 = new String("你好".getBytes(), "GBK");
        System.out.println(s4);
        //默认编码格式
        System.out.println(System.getProperty("file.encoding"));
        //统一使用GBK编码
        String s5 = new String("你好".getBytes("GBK"), "GBK");
        System.out.println(s5);

        char[] chars = {'a', 'b', 'c'};
        //通过字符数组创建对象
        String s6 = new String(chars);
    }
}
