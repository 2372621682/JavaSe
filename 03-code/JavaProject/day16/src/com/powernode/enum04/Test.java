package com.powernode.enum04;

//交通信号
enum TrafficSignal{
    //属性都是：public static final
    STOP,GO,CAUTION
}

public class Test {
    public static void main(String[] args) {
        TrafficSignal[] values = TrafficSignal.values();
        switch (values[1]) {
            //case条件必须是枚举值之一
            case GO -> System.out.println("green");
            case STOP -> System.out.println("red");
            case CAUTION -> System.out.println("yellow");
        }
    }
}
