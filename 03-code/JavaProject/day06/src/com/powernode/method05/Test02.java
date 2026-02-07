package com.powernode.method05;

public class Test02 {
    public static void main(String[] args) {
        method02();
    }
    public static void method01(){
        int i = 0;
        while(true){
            System.out.println(i++);
        }
    }
    //.StackOverflowError堆栈溢出错误
    public static void method02(){
        int i = 0;
        System.out.println(i++);
        method02();
    }
}
