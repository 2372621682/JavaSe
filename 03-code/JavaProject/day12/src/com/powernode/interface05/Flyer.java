package com.powernode.interface05;

public interface Flyer {
    /**
     * 1.在JDK8之前，接口是用于定义规范的，不做具体实现
     * 2.public abstract 可以省略不写，默认就是public abstract
     * 3.在接口中不可以包含实例块{} 和静态块 static{}
     *    1.实例块（{}）用于初始化实例对象时执行代码（属于对象的初始化逻辑），
     *    2.静态块（static {}）用于初始化类的静态资源（属于类的初始化逻辑），
     *      两者都属于具体实现代码（接口的核心定位：行为规范而非实现）。
     * 4.接口中不可以包含构造器
     */
    // {}
    //static {}
    public abstract void fly();
    void land();
}
