package com.powernode.static12;

class Chairman{
    //1.把构造器封装
    private Chairman(){
        System.out.println("Chairman.Chairman");
    }

    //2.声明一个Chairman类型的静态变量
    private static Chairman chairman;
    //3.获得对象
    public static Chairman getInstance(){
        if (chairman == null){
            chairman = new Chairman();
        }
        return chairman;
    }
}
public class Test {
    public static void main(String[] args) {
        Chairman chairman1 = Chairman.getInstance();
        Chairman chairman2 = Chairman.getInstance();
        System.out.println(chairman1 == chairman2);
    }
}
