package com.powernode.interface11;

public interface Flyer {
    /**
     * 1.默认方法
     *    1.默认方法的作用
     *    2.解决接口升级问题(新增方法)
     *      1.解决方案：在接口中添加抽象方法，子类重写抽象方法，工程量比较大
     *      2.解决方案：使用默认方法，只需要在接口中添加具体方法，对子类不做修改，对子类也做了扩展
     *    3.默认方法的限制：所有的子类都是一样的
     *
     * 2.私有方法（jdk9）
     *   1.私有方法主要为默认方法提供服务的
     *   2.在很多的默认方法中，有代码相同的片段处理同样的功能，可以把这个代码片段抽取出来，放到一个私有方法中，
     *   供其他默认的方法调用
     *   3.减少了代码的冗余，提高程序的内聚性
     *
     */
    default void method1(){
        method();
        System.out.println("-------处理其他业务-------");
    }
    default void method2(){
        method();
        System.out.println("-------处理其他业务-------");
    }
    private void method(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*default void method1(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------处理其他业务-------");
    }
    default void method2(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------处理其他业务-------");
    }*/
    /**
     * 3.静态方法
     *    1.类似于默认方法
     *    2.用于完成通用的功能
     */
    public static void land(){
        System.out.println("Flyer.land");
    }
    /**
     * 4.私有静态方法（jdk9）
     *    1.私有静态方法主要为静态方法提供服务的
     *    2.在很多的静态方法中，有代码相同的片段处理同样的功能，可以把这个代码片段抽取出来，放到一个私有静态方法中，
     * 供其他静态的方法调用
     *    3.减少了代码的冗余，提高程序的内聚性
     */
    private static int max(int x , int y){
        return x > y ? x :y;
    }

}
class Dog implements Flyer{}
class Cat implements Flyer{}
