package com.powernode.enum03;

//交通信号
enum TrafficSignal{
    //属性都是：public static final
    STOP,GO,CAUTION
}

public class Test {
    public static void main(String[] args) {
        /**
         * 1.枚举类有一个默认的方法：public static TrafficSignal[] values()
         * 2.方法的作用，把枚举的每个属性封装为数组返回
         */
        TrafficSignal[] values = TrafficSignal.values();
        for (TrafficSignal value : values) {
            System.out.println(value);
        }
        System.out.println("--------------");
        for (int i = 0; i < values.length; i++) {
            TrafficSignal value = values[i];
            System.out.println(value);
        }
    }
}
