package com.powernode.private05;

class Teacher{
    String name = "zs";
    int age = 23;
    char sex = '男';

}
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.sex = '女';
        System.out.println(teacher.sex);
        /**
         * 其他类拿到了实例变量赋值不合法
         * 可以使用封装来解决
         */
        teacher.sex = 'X';
        System.out.println(teacher.sex);

    }
}
