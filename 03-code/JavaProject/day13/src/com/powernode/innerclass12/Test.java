package com.powernode.innerclass12;
//外部类
class OuterClass{
    private int x;
    private int y;

    public OuterClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void add(){
        System.out.println("OuterClass.add");
    }
    //内部类
    class InnerClass{
        public InnerClass() {
            System.out.println("InnerClass.InnerClass");
        }
        public int max(){
            return x > y ? x : y;
        }
    }
    //一个外部类可以包含多个内部类
    class InnerClass02{}
}
public class Test {
    public static void main(String[] args) {
        //1.创建外部类对象
        OuterClass outerClass = new OuterClass(2,3);
        //2.语法：外部类.内部类  内部类对象  =  外部类对象.new 内部类构造器()
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.max());
        /**
         * 1.内部类会生成单独的.class文件
         * 2.内部类.class文件命名规则：外部类$内部类.class
         * 3.类命名的时候尽量不使用$
         */
    }
}
