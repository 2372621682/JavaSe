package com.powernode.string04;

public class Test02 {
    public static void main(String[] args) {
        /**
         * length()	可以获取到字符串中有多少个字符
         * charAt(int index)	返回指定索引位置的char值
         * int indexOf(int ch)	返回指定字符第一次出现在字符串内的索引。如果没有找到返回 -1
         * int indexOf(int ch, int fromIndex)	返回指定字符第一次出现在字符串内的索引，以指定的索引开始搜索。如果没有找到返回 -1
         * int indexOf(String str)	返回指定子字符串第一次出现在字符串内的索引。如果没有找到返回 -1
         * int indexOf(String str, int fromIndex)	返回指定子串的第一次出现在字符串中的索引，从指定的索引开始搜索。如果没有找到返回 -1
         * int lastIndexOf(int ch)	返回指定字符最后一次出现在字符串内的索引,如果没有找到返回 -1
         * int lastIndexOf(int ch, int fromIndex)	返回指定字符最后一次出现在字符串内的索引，以指定的索引开始反向搜索，没找到为 -1
         * int lastIndexOf(String str)	返回指定子字符串最后一次出现在字符串内的索引，如果没有找到返回 -1
         * int lastIndexOf(String str, int fromIndex)	返回指定子串的最后一次出现在字符串中的索引，从指定的索引开始反向搜索，没找到为 -1
         */
        String s = "abcABCabc";
        System.out.println(s.length());//9
        System.out.println(s.charAt(0));//a
        System.out.println(s.indexOf(97));//0
        System.out.println(s.indexOf(97, 2));//6
        System.out.println(s.indexOf("a"));//0
        System.out.println(s.indexOf("a", 2));//6
        System.out.println(s.lastIndexOf(97));//6
        System.out.println(s.lastIndexOf(97, 5));//0
        System.out.println(s.lastIndexOf("a"));//6
        System.out.println(s.lastIndexOf("a", 5));//0

    }
}
