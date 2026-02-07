package com.powernode.innerclass16;
class OuterClass{
    public void method( int x,int y){
        /**
         * - 局部内部类就是一个局部的成员（类似于局部变量）
         *   1.不可以使用public ,private和protected修饰
         *   2.可以使用final修饰
         *   3.不可以static修饰
         */
        class InnerClass{
            public int x = 10;
            public static int y = 20;

            public void method(){
                System.out.println("x = " + x);
                System.out.println("y = " + y);
            }

            public static int max(int x, int y){
                return x > y ? x : y;
            }
        }
        //局部内部类，在这类创建对象
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.x);
        innerClass.method();

        System.out.println(InnerClass.y);
        System.out.println(InnerClass.max(2, 3));
    }
}
public class Test {
    public static void main(String[] args) {
        new OuterClass().method(2,3);
    }
}
