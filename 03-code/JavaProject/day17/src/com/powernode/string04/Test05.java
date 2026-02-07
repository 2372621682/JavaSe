package com.powernode.string04;

import java.rmi.RMISecurityManager;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Test05 {
    public static void main(String[] args) {
        String s = "aaaaaa";
        //1.遇到了参数名：regex，让传递是正则表达式
        System.out.println("s.matches(\"[a]\") = " + s.matches("[a]*"));
        /**
         * 1.[a]:匹配a
         * 2.[a]* 匹配0个或者多个a
         */
        //2.正则表达式一般工作中用于数据合法性校验，比如电话号码是否合法
        String phone = "18610241888";
        String regex = "^1[3-9]\\d{9}";
        /**
         * 1.^1:第一位，字符串开头必须是1
         * 2.[3-9]:第二位，必须是3-9中的任意一个数字
         * 3.\d:匹配数字
         * 4.{9}：重复9次
         */
        boolean matches = Pattern.matches(regex, phone);
        System.out.println(matches);

        String s1 = "a,b:c|d";
        //按照标点符号进行分割，返回一个字符串数组
        String[] split = s1.split("[,:|]");
        System.out.println(Arrays.toString(split));

        String s2 = "Hello,123 word 456";
        String s3 = s2.replaceAll("\\d", "");
        System.out.println(s3);

    }
}
