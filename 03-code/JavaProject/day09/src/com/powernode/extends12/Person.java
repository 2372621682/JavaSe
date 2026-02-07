package com.powernode.extends12;

public class Person {
    public String name = "zs";
    //私有成员：只能本类访问
    private int age = 23;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Teacher extends Person{

}
class Test{
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        System.out.println(t1.name);
        //System.out.println(t1.age);
        t1.setAge(33);
        System.out.println(t1.getAge());
    }
}
