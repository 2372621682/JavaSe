package com.powernode.bufferandbuilder05;

public class Test01 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = s1 + "def";
        System.out.println(s1 == s2);//false

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1.append("def");
        System.out.println(sb1 == sb2);

        StringBuilder sb3 = new StringBuilder("abc");
        StringBuilder sb4 = sb3.append("def");
        System.out.println(sb3 == sb4);//true



    }
}
