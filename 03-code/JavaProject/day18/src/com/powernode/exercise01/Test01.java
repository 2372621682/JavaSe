package com.powernode.exercise01;

public class Test01 {
    public static void main(String[] args) {
        String str = "      abcdjklnmuxwxyz     ";
        String newStr = str.trim();
        System.out.println(newStr.length());
        System.out.println(newStr.startsWith("abc"));
        System.out.println(newStr.endsWith("xyz"));
        System.out.println(newStr.substring(3, 6).toUpperCase());
        System.out.println(newStr.contains("lnm"));
        System.out.println(newStr.indexOf("lnm"));

    }
}
