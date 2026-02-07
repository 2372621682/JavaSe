package com.powernode.extends20;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   public void m1(){
       System.out.println("Person.m1");
   }
   public String getDetails(){
       return "姓名：" + name + "\t年龄：" + age;
   }
}
class Teacher extends Person{
    private int tno;

    Teacher(String name,int age,int tno){
        super(name,age);
        this.tno = tno;
    }

    @Override
    public void m1() {
        //super.m1();父类的m1方法
        //this.m1();//子类的m1方法
        System.out.println("Teacher.m1");
    }
    @Override
    public String getDetails() {
        return super.getDetails() + "\t编号：" + tno;
    }
}
class Test{
    public static void main(String[] args) {
        Teacher teacher = new Teacher("zs", 23, 1001);
        teacher.m1();
        System.out.println(teacher.getDetails());
    }
}