package com.powernode.static09;

class Teacher{
    private String name = "zs";
    private static double deptExpenditure = 8000;

    /**
     * 1.静态方法
     *    1.静态方法不可以访问实例变量
     *    2.静态方法不可以访问实例方法
     */
    public static void method01(){
        System.out.println(deptExpenditure);
        //Non-static field 'name' cannot be referenced from a static context
        //System.out.println(name);静态方法不可以访问实例变量
        method02();
       // method03();
    }
    public static void method02(){}

    /**
     * 2.实例方法
     *   1.实例变量
     *   2.实例方法
     *   3.静态变量
     *   4.静态方法
     * 问？实例方法为什么可以访问静态成员呢？
     *   1.因为实例方法可以访问的时候，说明对象已经创建
     *   2.创建对象时，会先把类加载进来
     *   3.类加载完毕，静态变量在元空间中分配了内存，静态方法即可使用
     *   4.所以实例方法可以访问静态成员
     *   5.静态方法不可以访问实例成员
     */
    public  void method03(){
        System.out.println(name);
        System.out.println(deptExpenditure);
        method02();
    }

}
public class Test {

}
