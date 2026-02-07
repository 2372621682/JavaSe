package com.powernode.static08;

class MyMath{
    public static int add(int x ,int y){
        return x + y;
    }
    public static int max(int x,int y){
        return x > y ? x:y;
    }
}
class Teacher {
    private String name;
    private int age;
    //部门经费
    private static double deptExpenditure = 8000;

    public static double getDeptExpenditure() {
        return deptExpenditure;
    }
}
public class Test{
    public static void main(String[] args) {
        System.out.println(MyMath.add(2, 3));
        System.out.println(MyMath.max(2, 3));
        System.out.println(Teacher.getDeptExpenditure());
    }
}