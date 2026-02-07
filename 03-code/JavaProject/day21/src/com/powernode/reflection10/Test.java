package com.powernode.reflection10;
interface Itf01{}
interface Itf02{}
class Person{}
class Teacher extends Person implements Itf01,Itf02{}
public class Test {
    public static void main(String[] args) {
        //1.拿到字节码文件对象
        Class<Teacher> teacherClass = Teacher.class;
        //2.获得父类
        Class<? super Teacher> superclass = teacherClass.getSuperclass();
        System.out.println(superclass.getName());
        System.out.println(superclass.getSimpleName());
        //3.获得接口
        Class<?>[] interfaces = teacherClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getSimpleName());
        }
        //4.获得包名
        System.out.println(teacherClass.getPackageName());
        System.out.println(teacherClass.getPackage().getName());

    }
}
