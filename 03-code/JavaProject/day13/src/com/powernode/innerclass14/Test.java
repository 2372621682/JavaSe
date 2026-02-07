package com.powernode.innerclass14;
class OuterClass{
    private int x = 10;
    private int y = 20;
    class InnerClass{
        public static int x = 30;
        public static void method(){
            System.out.println("InnerClass.method");
        }
    }
}
public class Test {
    public static void main(String[] args) {
        //1.访问实例内部类的静态属性
        System.out.println(OuterClass.InnerClass.x);
        //2.访问实例内部类的静态方法
        OuterClass.InnerClass.method();
    }
}
