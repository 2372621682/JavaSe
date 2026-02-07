package com.powernode.class12;

class Teacher{
    String name = "zs";
    int age = 23;

    //实例方法：描述实例变量的信息
    public String getDetails(){
       /* String info = "姓名：" + name + "\t年龄：" + age;
        return  info;*/
        return  "姓名：" + name + "\t年龄：" + age;
    }
}
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println(teacher.getDetails());
    }
}
