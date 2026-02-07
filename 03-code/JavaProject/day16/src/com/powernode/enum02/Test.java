package com.powernode.enum02;

//交通信号
enum TrafficSignal{
    //属性都是：public static final
    STOP,GO,CAUTION
}

public class Test {
    public static void main(String[] args) {
        System.out.println(TrafficSignal.STOP);//静态
        //TrafficSignal.GO= GG;java: 无法为 static final 变量 GO 分配值
    }
}
