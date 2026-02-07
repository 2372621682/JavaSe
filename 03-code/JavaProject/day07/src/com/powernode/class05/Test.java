package com.powernode.class05;

class Teacher{
    String name = "张三";
    int age = 18;
    char sex = '男';
}
public class Test {
    public static void main(String[] args) {
        //1.修改局部变量的值
        int i = 2;
        i = 3;
        //2.实例变量修改值
        //2.1创建对象
        Teacher teacher = new Teacher();
        //2.2通过对象修改变量值
        teacher.name = "ls";
        teacher.age = 23;
        teacher.sex = '女';

        System.out.println(teacher.name);
        System.out.println(teacher.age);
        System.out.println(teacher.sex);
    }
}
