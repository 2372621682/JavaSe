package com.powernode.exercise01;

class Student{
    String name = "zs";
    int age = 23;
    char sex = '男';
    int id = 1001;
    double score = 99.9;

    //[修饰符] 返回类型 方法名称([形参类别]){方法体;}
    public String say(){
        return "姓名：" + name + "\t年龄：" + age + "\t性别：" + sex + "\tid：" + id + "\t分数：" + score;
    }
}
//听懂了，看懂了，写明白了
public class TestStudent {
    public static void main(String[] args) {
        //数据类型  变量名称 = new 数据类型();
        Student student = new Student();
        //对象名称.方法名称([实参列表])
        System.out.println(student.say());
        //对象名称.属性名称
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
        System.out.println(student.id);
        System.out.println(student.score);
    }
}
