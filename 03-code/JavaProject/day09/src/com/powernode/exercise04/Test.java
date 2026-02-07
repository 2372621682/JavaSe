package com.powernode.exercise04;

class Student{
    private String name;
    private char gender;
    private int age;
    private int id;
    private double score;

    //如果一个类没有任何构造方法，jvm编译时会添加默认构造器
    Student(){
       /* name = "zs";
        gender = '男';
        age = 23;
        id = 1001;
        score = 99.9;*/
        this("zs");
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
       /* this.name = name;
        this.gender = gender;*/
        this(name,gender,0);
    }

    public Student(String name, char gender, int age) {
       /* this.name = name;
        this.gender = gender;
        this.age = age;*/
        this(name, gender, age, 0);
    }

    public Student(String name, char gender, int age, int id) {
       /* this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;*/
        this(name,gender,age,id,0);
    }

    //如果局部变量和实例变量同名了，使用this来表示实例变量
    Student(String name,char gender,int age,int id,double score){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.score = score;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public String say() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", score=" + score +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.say());

        Student student1 = new Student("zs",'女',23,1002,100);
        System.out.println(student1.say());
    }
}
