package com.powernode.extends14;

public class Person {
    public  void sleep(){
        System.out.println("躺着睡");
    }
}
class Teacher extends Person{
    /**
     * 1.@Override的作用
     *    1.约束了该方法，必须是重写父类的
     *    2.具体作用：
     *      1.避免重写写错
     *      2.提高可读性
     * 2.重写的规则（会背）
     *    1.方法重写，两个子类必须有父子关系
     *    2.返回类型，方法名称和参数列表和父类一样
     *    3.子类的访问权限 >= 父类的访问权限
     *       访问权限的从大到小：public > protected > default(不写） > private
     *    4.private 修饰的方法不可以被重写
     *    5.static 修饰的方法不可以被重写
     *    6.异常：子类 <= 父类（异常专题讲解）
     *    7.在实际的工作中：通常情况下：把父类的方法重写一份，只改方法体
     *
     */
    @Override
    public  void sleep() {
        System.out.println("趴着睡");
    }
}