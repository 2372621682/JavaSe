package com.powernode.switch08;

public class Test05 {
    public static void main(String[] args) {
        char c = 'b';
        /**
         * 1.switch表达式中的数据类型可以和case条件不一样
         * 2.能兼容即可（不用强制转换直接赋值）
         * 3.注意：一般不这么写
         */
        switch (c){
            case 'a' -> System.out.println('a');
            case 98 -> System.out.println('b');
            case 'c' -> System.out.println('c');
            default -> System.out.println("非法字符");
        }
        //char c1 = 98;
    }
}
