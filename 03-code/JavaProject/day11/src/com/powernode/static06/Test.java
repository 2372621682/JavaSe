package com.powernode.static06;

class Teacher{
    String name ;
    int age;
    //部门经费
    static double deptExpenditure = 8000;
}
public class Test {
    public static void main(String[] args) {
        //静态变量：类名称直接访问
        System.out.println(Teacher.deptExpenditure);
        System.out.println(new Teacher().age);
    }
}
