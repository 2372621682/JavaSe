package com.powernode.constructor17;
class Teacher{
    private String name;
    private int age;
    private char sex;
    /**
     * - 方法重载
     *    1.在同一个类中
     *    2.方法名称相同
     *    3.形参类别不同
     *       1.个数不同
     *       2.类型不同
     *       3.顺序不同
     */
    Teacher(){
    }

    Teacher(String name ){
        this.name = name;
    }

    Teacher(String name ,int age){
        this.name = name;
        this.age = age;
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

        Teacher t2 = new Teacher("zs");
        System.out.println(t2.getDetails());

        Teacher t3 = new Teacher("zs", 23);
        System.out.println(t3.getDetails());

        Teacher t4 = new Teacher("zs", 23, '女');
        System.out.println(t4.getDetails());

    }
}
