package com.powernode.class02;

/**
 * 老师为什么叫老师
 *   1. 属性：姓名，年龄，性别，职称，讲师编号等
 *   2. 方法：授课，布置作业等
 */
class Teacher{
    //1.属性|实例变量|字段|成员变量
    String name = "zs";
    int age = 23;
    char sex = '男';
    //2.方法
    /**
     * 1.static修饰的方法，不需要创建对象可以直接使用
     * 2.非static修饰的方法，需要创建对象后才可以使用，所以这种方法也叫实例方法
     */
    public  void lecture(){
        System.out.println("授课");
    }
    public void assignHomeWork(){
        System.out.println("布置家庭作业");
    }
}


public class Test01 {
    public static void main(String[] args) {

    }
}
