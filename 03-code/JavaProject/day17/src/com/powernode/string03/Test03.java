package com.powernode.string03;

public class Test03 {
    public static void main(String[] args) {
        /**
         * 1. + 运算符的两边都是【字面量】的时候，运算是在编译时完成的
         * 2. 在生成.class文件的代码里面，实际上就是拼接后的“abcdef”
         * 3. 程序执行到【s1 = "abc" + "def"】,先去常量池中找“abcdef”
         * 4. 如果不存在，就创建“abcdef”，放入常量池
         * 5. 执行到【s2 = "abcdef"】，从常量池中取到“abcdef”
         */
        String s1 = "abc" + "def";
        String s2 = "abcdef";

        System.out.println(s1 == s2);//true
    }
}
