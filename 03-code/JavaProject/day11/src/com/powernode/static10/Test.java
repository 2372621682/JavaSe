package com.powernode.static10;

class Chairman{
    //1.把构造器封装起来（创建对象需要用到构造器，构造器不能让其他类访问）
    private Chairman(){
        System.out.println("Chairman.Chairman");
    }
    //2.类加载的时候创建对象(类只加载一次，所以在类加载的时候创建比较合适)
    private static Chairman chairman = new Chairman();
    
    //3.提供get方法获得对象
    public static Chairman getInstance() {
        return chairman;
    }
}
public class Test {
    public static void main(String[] args) {
        /**
         * 需求：
         *   1.一个公司只有一个董事长
         *   2.董事长类只能创建一个对象
         * 一个类只能创建一个对象，这个类就是单例（只能有一个实例对象）
         */
        Chairman instance = Chairman.getInstance();
        System.out.println(instance);
    }
}
