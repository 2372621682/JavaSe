package com.powernode.extends16;

public class Person {
    public String name = "父类name";
    public Person(){
        System.out.println("Person.Person");
    }
}
class Teacher extends  Person{
    public String name = "子类name";
    /**
     * 1.Teacher 没有任何构造器
     * 2.编译器会在编译时添加默认构造器
     * 3.默认构造器的第一行会【默认添加super()】
     * 4.super(),调用父类无参构造器
     * 5.调用‘super()’必须是构造函数体中的第一条语句
     */
    Teacher(){
        //System.out.println("Teacher.Teacher");
        super();//调用‘super()’必须是构造函数体中的第一条语句
    }
}
class Test{
    public static void main(String[] args) {
        /**
         * 创建子类对象时，先创建父类对象
         */
        Teacher teacher = new Teacher();
    }
}
