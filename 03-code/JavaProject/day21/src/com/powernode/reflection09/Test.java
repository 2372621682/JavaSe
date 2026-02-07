package com.powernode.reflection09;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Teacher{
    public void method01(){
        System.out.println("Teacher.method01");
    }
    public int method02(int x,int y){
        System.out.println("Teacher.method02(int x,int y)");
        return x + y;
    }
    private void method03(String x,int y){
        System.out.println("Teacher.method03(String x,int y)");
    }
    public static void method04(){
        System.out.println("Teacher.method04");
    }
}
public class Test {
    public static void main(String[] args) throws Exception {
        /**
         * - 方法
         *   1.修饰符
         *   2.返回类型
         *   3.方法名称
         *   4.形参列表
         *   5.方法调用
         */
        System.out.println("===========实例方法调用==================");
        //1.获得字节码文件对象
        Class<Teacher> teacherClass = Teacher.class;
        //2.通过字节码文件对象拿到方法对象
        Method method01 = teacherClass.getMethod("method01");
        //3.创建对象
        Teacher teacher = teacherClass.newInstance();
        //4.调用方法(无参方法)
        method01.invoke(teacher);
        //5.调用有参方法
        Method method02 = teacherClass.getMethod("method02", int.class, int.class);
        int sum = (int) method02.invoke(teacher, 10, 20);
        System.out.println("sum = " + sum);
        //6.私有方法调用
        //6.1获得私有方法对象
        Method method03 = teacherClass.getDeclaredMethod("method03", String.class, int.class);
        //6.2设置访问权限
        method03.setAccessible(true);
        method03.invoke(teacher, "zs", 20);
        System.out.println("===========静态方法调用==================");
        Method method04 = teacherClass.getMethod("method04");
        method04.invoke(null);
    }
}
