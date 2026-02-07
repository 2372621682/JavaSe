package com.powernode.method05;

public class Test03 {
    public static void main(String[] args) {
        /**
         * 1.软件的开发原则：高内聚，低耦合
         *    1.高内聚：方法，类或者模块处理的业务功能单一性比较高，称为高内聚
         *    2.低耦合：类与类之间，模块与模块之间的关系低，称为低耦合
         */
        /**
         * 跨类调用
         *   1.类名称.方法名称([实参列表])
         *   2.要求被调用的方法必须时static修饰的
         */
        int max = MyMath.max(2, 3);
        System.out.println(max);
        int add = MyMath.add(2, 3);
        System.out.println(add);
        insert();
        String s = queryAll();
        System.out.println("s = " + s);

    }
    //做业务的方法：增,删,改,查...
    public static void insert(){
        System.out.println("Test03.insert");
    }
    public static String queryAll(){
        return "查询结果";
    }
    //.....

}
