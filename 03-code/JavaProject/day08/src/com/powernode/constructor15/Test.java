package com.powernode.constructor15;

class Teacher{
    private String name;
    private int age;

    Teacher(String name,int age){
        this.name = name;
        this.age = age;
    }

   /* public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }*/
}
public class Test {
    public static void main(String[] args) {
        //创建对象的时候为属性批量赋值
        Teacher teacher = new Teacher("zs",23);

    }
}
