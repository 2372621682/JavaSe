package com.powernode.innerclass15;
class OuterClass{
    private int x;
    private int y;
    private static  int z = 60;

    public OuterClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public static int getZ() {
        return z;
    }
    /**
     * 1.静态内部类,在自己的作用域内，就当成一个普通的类
     *    1.实例成员
     *    2.静态成员
     */
    static class InnerClass{
        public int x = 20;
        public static int n = 30;

        public void method(){
            //System.out.println(y);1.静态内部类中，实例方法不可以访问外部类实例变量
            System.out.println(z);//2.静态内部类，实例方法可以访问外部的静态变量
            System.out.println(getZ());//3.静态内部类，实例方法可以访问外部的静态方法
            //System.out.println(getX());//4.静态内部类，实例方法不可以访问外部的实例方法
            //5.静态内部类中，不持有外部类引用
            //System.out.println(OuterClass.this);

        }
        public static int max(int x,int y){
            return x > y ? x : y;
        }
    }
}
public class Test {
    public static void main(String[] args) {
        //1.访问静态内部类的静态成员
        System.out.println(OuterClass.InnerClass.n);
        System.out.println(OuterClass.InnerClass.max(2, 3));
        //2.访问静态内部类的实例成员
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
    }
}
