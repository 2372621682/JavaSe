package com.powernode.extends19;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
class Teacher extends Person{
    private int tno;

    Teacher(String name,int age,int tno){
        super(name,age);
        this.tno = tno;
    }


}
class Test{
    public static void main(String[] args) {
        Teacher teacher = new Teacher("zs", 23, 1001);
    }
}