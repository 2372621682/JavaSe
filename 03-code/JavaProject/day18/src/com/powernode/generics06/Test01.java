package com.powernode.generics06;

import com.powernode.generics04.Test;

class Teacher{}
class TestObject<AAA>{//可以理解为形参，T就是一个引用类型的变量
    //实例变量
    int id;
    //实例变量不确定
    AAA t;

    public void setT(AAA t) {
        this.t = t;
    }
}

/**
 * T和E 不具有实际意义，只是定义一个形参，因为泛型传递的是数据类型，所以叫T(Type)更具有意义
 */
/*class TestObject<T>{//可以理解为形参，T就是一个引用类型的变量
    //实例变量
    int id;
    //实例变量不确定
    T t;

    public void setT(T t) {
        this.t = t;
    }
}*/
public class Test01 {
    public static void main(String[] args) {
        TestObject<Teacher> testObject = new TestObject();
        testObject.setT(new Teacher());
    }
}
