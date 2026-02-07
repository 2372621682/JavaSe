package com.powernode.method02;

public class Test03 {
    public static void main(String[] args) {
        /**
         * 方法调用
         */
        method();
    }
    public static void method(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
