package com.powernode.string04;

public class Test03 {
    public static void main(String[] args) {
        /**
         * startsWith(String prefix)	判断字符串是否以指定字符串开头，返回值为boolean类型。
         * endsWith(String prefix)	判断字符串是否以指定字符串结尾，返回值为boolean类型。
         * contains(CharSequence s)	判断字符串中是否包含指定字符串，返回值为boolean类型
         * char[] toCharArray()	将此字符串转换为新的字符数组
         * byte[] getBytes()	得到一个操作系统默认的编码格式的字节数组
         * String toUpperCase()	返回一个新的字符串，该字符串中所有英文字符转换为大写字母
         * String toLowerCase()	返回一个新的字符串，该字符串中所有英文字符转换为小写字母
         */
        String s = "abcABCabc";
        System.out.println("s.startsWith(\"abc\") = " + s.startsWith("abc"));//true
        System.out.println("s.endsWith(\"abc\") = " + s.endsWith("abc"));//true
        System.out.println("s.contains(\"abc\") = " + s.contains("abc"));//true
        char[] charArray = s.toCharArray();
        byte[] bytes = s.getBytes();
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        /**
         * String substring(int beginIndex)	从beginIndex开始截取字符串，到字符串末尾结束
         * String substring(int beginIndex, int endIndex)	从beginIndex开始截取字符串，到字符索引endIndex-1结束
         * String replace(char oldChar, char newChar)	通过用newChar字符替换字符串中出现的所有oldChar字符，并返回替换后的新字符串
         * String replace(CharSequence target, CharSequence replacement)	将需要替换的字符串（target）替换为指定字符串（replacement）
         * String concat(String str)	，将指定的字符串连接到该字符串的末尾，该方法实现的功能和“+”连接符比较相似。
         * boolean isEmpty()	判断字符串内容是否为空。当字符串长度为0，则返回true，否则返回false。
         * boolean equals(Object anObject)	判断字符串内容是否相同
         * boolean equalsIgnoreCase(String str)	判断字符串内容是否相同，忽略字母大小写
         * valueOf(Object obj) 	方法是一个静态方法，可以把基本数据类型转化为字符串类型
         */
        s = "abcABCabc";
        System.out.println("s.substring(1) = " + s.substring(1));//"bcABCabc"
        System.out.println("s.substring(1,3) = " + s.substring(1, 3));//bc
        System.out.println("s.replace('b','x') = " + s.replace('b', 'x'));//axcABCaxc
        System.out.println("s.replace(\"ab\",\"xx\") = " + s.replace("ab", "xx"));//xxcABCxxc
        /**
         * concat 和 + 的区别
         *    1.concat如果拼接的字符串为“”不会创建新的对象
         *    2.+ 拼接的字符串如果为“”也会创建新的对象
         *    3.如果拼接都不为“”都会创建新的对象
         */
        String s1 = "abc";
        String s2 = s1.concat("");
        System.out.println(s1 == s2);//true

        String s3 = "abc";
        String s4 = s3 + "";
        System.out.println(s3 == s4);//false
        /**
         * isEmpty 和 null
         *   1.isEmpty有对象，没有内容，内存有开辟空间
         *   2.null,没有对象，内存没有开辟空间
         */
        String s5 = "";
        System.out.println("s5.isEmpty() = " + s5.isEmpty());//true
        System.out.println("\"abc\".equals(\"ABC\") = " + "abc".equals("ABC"));//false
        System.out.println("\"abc\".equalsIgnoreCase(\"ABC\") = " + "abc".equalsIgnoreCase("ABC"));//true
        //把基本类型转换为字符串
        String s6 = String.valueOf(123);

    }
}
