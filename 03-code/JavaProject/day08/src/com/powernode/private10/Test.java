package com.powernode.private10;
class Teacher{
    /**
     * - 权限修饰符一共有四个（先知道两个）
     *   1.private(权限最小，只能本类中访问)
     *   2.public (权限最大)
     *   3.private 可以修饰：
     *      1.字段
     *      2.方法
     *   4.Modify:单词，修饰
     *   5.权限修饰符：只要是修饰属性和方法的，也可以修饰类（private不可以）,不可以修饰局部变量
     */
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    //只能本类访问
    private String getName() {
        return name;
    }
}
public class Test {
}
