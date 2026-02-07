package com.powernode.enum05;
enum TrafficSignal01{
    STOP;

    TrafficSignal01() {
        System.out.println("TrafficSignal01.TrafficSignal01");
    }


    public static void main(String[] args) {
        //枚举不可以new对象
       //TrafficSignal01 trafficSignal01 =  new TrafficSignal01();
    }
}
enum TrafficSignal{
    STOP("red","停车"),
    GO("green","通行"),
    CAUTION("yellow","警告");
    /*STOP,GO,CAUTION*/
    private final String color;
    private final String description;
    // 枚举的构造器默认且只能是 private，即使不写 private 修饰符，编译器也会自动隐式添加。
     private TrafficSignal(String color, String description) {
        this.color = color;
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }
}
public class Test {
    public static void main(String[] args) {
        //System.out.println(TrafficSignal01.STOP);
        System.out.println(TrafficSignal.GO);
        System.out.println("------------");
        TrafficSignal[] values = TrafficSignal.values();
        for (TrafficSignal value : values) {
            System.out.println("信号指示：" + value.name());//STOP GO CAUTION
            System.out.println("颜色：" + value.getColor());
            System.out.println("描述：" + value.getDescription());
        }
        /**
         * 面试题：枚举是不是单例的，为什么？
         *    1.枚举的常量都是预先定义且不可改变，在定义是确定
         *    2.其创建和管理由编译器和JVM严格控制，与普通的new创建对象不同，枚举是在加载时创建对象，确定用途的
         *    3.从单例的角度来讲，枚举虽然有多个常量（对象），每个常量在特定的环境下是唯一的
         *    4.所以每个常量都是一个单例，可以把枚举看成一个单例的集合
         */
    }
}
