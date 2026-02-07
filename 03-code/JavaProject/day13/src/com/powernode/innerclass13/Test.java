package com.powernode.innerclass13;
class OuterClass{
    private int x  = 10;
    private int y;
    class InnerClass{
        public int x = 30;
        public void method(){
            System.out.println("x = " + x);//30
            System.out.println("this.x = " + this.x);//30
            System.out.println("InnerClass.this.x = " + InnerClass.this.x);//30
            System.out.println("OuterClass.this.x = " + OuterClass.this.x);//10
        }
    }
}
public class Test {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.x);//30
        innerClass.method();
    }

}
