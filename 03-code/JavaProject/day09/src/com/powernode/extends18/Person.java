package com.powernode.extends18;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class Teacher extends Person{
    private int tno;
    /*Teacher(){
        super();
    }*/
    //可以理解为有三个属性，父类的两个要借助子类构造器初始化
    Teacher(String name,int age,int tno){
        super(name,age);
        this.tno = tno;
    }

    public int getTno() {
        return tno;
    }
}
class Test{
    public static void main(String[] args) {
        Teacher teacher = new Teacher("zs",23,1001);
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getTno());
    }
}