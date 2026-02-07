package com.powernode.class09;
class Teacher{
    //静态方法
    public static void method01(){
        System.out.println("Teacher.method01");
    }
    //实例方法
    public  void method02(){
        System.out.println("Teacher.method02");
    }

}
public class Test {
    public static void main(String[] args) {
        //静态方法访问：类名称.方法名称（[实参列表]）
        Teacher.method01();
        //实例方法访问：对象名称.方法名称（[实参列表]）
        Teacher teacher = new Teacher();
        teacher.method02();
    }
}
