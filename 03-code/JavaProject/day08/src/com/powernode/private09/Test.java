package com.powernode.private09;
class Teacher{
    String name;
    //1.封装
    private  int age;
    //2.set方法赋值
    public void setAge(int age) {
        this.age = age;
    }
    //3.get方法取值
    public int getAge() {
        return age;
    }
}
public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setAge(23);
        System.out.println(t1.getAge());

        Teacher t2 = new Teacher();
        t2.setAge(33);
        System.out.println(t2.getAge());
    }
}
