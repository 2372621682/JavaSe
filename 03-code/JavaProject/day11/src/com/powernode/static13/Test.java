package com.powernode.static13;

public class Test {
    static {
        System.out.println("静态块");
    }
    {
        System.out.println("实例块");
    }
    Test(){
        System.out.println("构造器");
    }

    public static void main(String[] args) {
        new Test();
        //new Test();
        /**
         * 输出结果：
         *    静态块    // 类加载时执行静态代码块
         *    实例块    // 创建对象时先执行实例代码块
         *    构造器    // 最后执行构造方法
         */
    }
}


class Test01{
    static {
        System.out.println("静态块");
    }
    {
        System.out.println("实例块");
    }
    Test01(){
        this(10);//调用重载构造器
    System.out.println("构造器1");
    }
    public Test01(int i){
        System.out.println("构造器2");
    }

    public static void main(String[] args) {
        new Test01();
        /**
         * 1.执行顺序：静态块->Test01()->Test01(int i) ->实例块
         * 2.输出结果：静态块->实例块->构造器2->构造器1
         */
    }
}
