package com.powernode.constructor19;
class Teacher{
    private String name;
    private int age;
    private char sex;

    Teacher(){
        /**
         * Call to 'this()' must be first statement in constructor body
         *  调用‘this()’必须是构造函数主体中的第一条语句
         */
        //System.out.println("------------------");
        this("zs", 23, '男');
    }


    Teacher(String name ,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getDetails(){
        return "姓名：" + name + "\t年龄：" + age +"\t性别：" + sex;
    }

}
public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        System.out.println(t1.getDetails());



        Teacher t4 = new Teacher("zs", 23, '女');
        System.out.println(t4.getDetails());

    }
}
