package com.powernode.private08;
class Teacher{
    String name = "zs";
    int age = 23;
    //1.封装：private
    private char sex = '男';
    //2.set方法赋值

    /**
     * 1.局部变量：通过方法声明的变量称为局部变量
     * 2.实例变量：类的属性
     * 3.区分变量：可以是this.变量：表示实例变量
     *
     */
    public void setSex(char sex){
       if (sex != '男' && sex != '女') {
            System.out.println("性别不合法");
            return;//结束了方法
        }
        this.sex = sex;
    }
    //3.get方法取值
    public char getSex() {
        return sex;
    }
}
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setSex('女');
        System.out.println(teacher.getSex());
    }
}
