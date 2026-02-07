package com.powernode.private07;
class Teacher{
    String name = "zs";
    int age = 23;
    //1.封装：private
    private char sex = '男';
    //2.set方法赋值
    public void setSex(char newSex){
        //第一种方案：
       /* if (newSex != '男' && newSex != '女') {
            System.out.println("性别不合法");
        }else{
            sex = newSex;
        }*/
        //第二种方案：(需要修改数据类型--放弃)
        //sex = newSex != '男' && newSex != '女' ? "性别不合法" : newSex;
        //第三种方案：
        if (newSex != '男' && newSex != '女') {
            System.out.println("性别不合法");
            return;//结束了方法
        }
        sex = newSex;


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
