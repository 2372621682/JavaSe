package com.powernode.static05;

class Student {
    public String name = "zs";
    public static double classFee = 8000;
}

public  class Test {
    public static void main(String[] args) {
        //静态变量：类名称直接可以访问
        System.out.println(Student.classFee);
        //实例变量：也叫对象变量，只有对象才可以访问
        System.out.println(new Student().name);
    }
}
