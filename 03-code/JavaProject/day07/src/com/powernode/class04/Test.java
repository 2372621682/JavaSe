package com.powernode.class04;

class Teacher{
    String name;
    int age;
}
public class Test {
    public static void main(String[] args) {
        //类名称 对象名称 = new  类名称();
        Teacher teacher = new Teacher();
        //com.powernode.class04.Teacher@2f4d3709
        System.out.println(teacher);
        //了解，不需要掌握
        System.out.println(Teacher.class);//拿到元空间中的class对象（Teacher的字节码文件对象）
        System.out.println(Teacher.class.getName());//通过字节码文件对象拿到 包名 + 类名称
        //teacher.hashCode() 通过hash算法，计算出的一个十进制数字
        System.out.println(Teacher.class.getName() + "@" + teacher.hashCode());
        //Integer.toHexString(teacher.hashCode()) 把十进制的hashCode转换为十六进制
        System.out.println(Teacher.class.getName() + "@" + Integer.toHexString(teacher.hashCode()));
    }
}
