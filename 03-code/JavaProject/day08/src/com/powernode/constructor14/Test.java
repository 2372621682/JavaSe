package com.powernode.constructor14;

 class Teacher{
    /**
     *   1. 一个类如果没有任何构造器，编译时会添加默认构造器
     *   2. 如果一个类有了构造器，编译时不会添加默认构造器
     *   3.构造器语法: [修饰符] 类名称([形参类别]){}
     *   4.javap  Teacher(命令查看.class文件)
     *   5.注意：默认构造器的修饰符和类的修饰符一样
     */
    Teacher(){
        System.out.println("Teacher.Teacher");
    }

}
public class Test {
    public static void main(String[] args) {
        //类名称 对象名称 = new 类名称([实参列表]);
        Teacher teacher = new Teacher();
        System.out.println(teacher);
    }
}
