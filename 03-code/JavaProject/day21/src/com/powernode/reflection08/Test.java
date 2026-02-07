package com.powernode.reflection08;

import java.lang.reflect.Field;
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
    public static void main(String[] args) {
        /**
         * - 方法
         *   1.修饰符
         *   2.返回类型
         *   3.方法名称
         *   4.形参列表
         *   5.方法调用
         */
        //1.获得字节码文件对象
        Class<Teacher> teacherClass = Teacher.class;
        /*Method[] methods = teacherClass.getMethods();//public 修饰的方法*/
        Method[] declaredMethods = teacherClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println("修饰符:" + Modifier.toString(method.getModifiers()));
            System.out.println("返回类型:" + method.getReturnType().getSimpleName());
            System.out.print("方法名称:" + method.getName());
            Class<?>[] parameterTypes = method.getParameterTypes();
            System.out.print(parameterTypes.length == 0?"()\n":"(");
            for (int i = 0; i < parameterTypes.length; i++) {
                Class<?> parameterType = parameterTypes[i];
                if (i == parameterTypes.length -1) {
                    System.out.println(parameterType.getSimpleName() + ")");
                }else{
                    System.out.print(parameterType.getSimpleName() + ",");
                }

            }
        }
    }
}
