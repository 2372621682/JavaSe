package com.powernode.annotation01;

public class Test {
    @Override //可以理解为一个标签 @Override标签的作用就是约束该方法必须重写父类的方法
    public String toString() {
        return super.toString();
    }
}
