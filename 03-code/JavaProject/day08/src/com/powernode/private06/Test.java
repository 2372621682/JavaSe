package com.powernode.private06;

class Teacher{
    String name = "zs";
    int age = 23;
    //1.封装字段：private 修饰符 修饰字段，使用private修饰后，该字段只能本类访问
    private char sex = '男';
    //2.提供set方法赋值：注意：命名规范：set + 字段名称首字母大写
    public void setSex(char newSex){//set访问内部需要用到外界的数据，所以要提供参数
        if (newSex != '男' && newSex != '女') {//如果性别不是男且不是女
            System.out.println("性别不合法");
        }else{//性别是男或者是女
            sex = newSex;
        }
    }
    //3.提供get方法获得值
    public char getSex(){
        return sex;
    }
}
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //teacher.sex = 'X';
        teacher.setSex('女');
        System.out.println(teacher.getSex());
    }
}
