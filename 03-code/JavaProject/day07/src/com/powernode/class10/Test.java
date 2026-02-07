package com.powernode.class10;

class Teacher{
    String name = "zs";
    public void lecture(){
        System.out.println("Teacher.lecture");
    }
}
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println(teacher.name);
        teacher.lecture();
        teacher = null;
        /**
         * 1.NullPointerException:Cannot read field "name" because "teacher" is null
         * 2.NullPointerException:称为：空指针异常
         *    1.什么原因造成的：
         *      1.使用了null的对象访问了属性
         *      2.使用了null的对象访问方法
         *
         */
        //System.out.println(teacher.name);
        teacher.lecture();
    }
}
