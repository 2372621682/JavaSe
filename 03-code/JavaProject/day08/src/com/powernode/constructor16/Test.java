package com.powernode.constructor16;
class Teacher{
    //1.属性
    private String name;
    private int age;
    private char sex;
    //2.构造方法
    Teacher(){
    }

    Teacher(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //3.set和get方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }
    //4.提供自我描述的信息
    public String getDetails(){
        return "姓名：" + name + "\t年龄：" + age +"\t性别：" + sex;
    }
}
public class Test {
    public static void main(String[] args) {
        //不知道属性值：无参构造器
        Teacher t1 = new Teacher();
        //知道属性值：全参构造器
        Teacher t2 = new Teacher("zs",23,'女');
        //修改name的值
        t2.setName("ww");
        System.out.println(t2.getName());

    }
}
