package com.powernode.annotation10;

import java.lang.annotation.*;

@Documented //生成文档时，该注解会保留在文档中
@Inherited //子类会继承父类的注解
@Retention(RetentionPolicy.RUNTIME) //运行时保留
@interface MyAnnotation {
}

@MyAnnotation
class Person{}

class Student extends Person{

}
public class Test {
    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;//获得Student的Class对象
        //获得Student类上的所有注解
        Annotation[] annotations = studentClass.getAnnotations();
        for (Annotation annotation : annotations) {
            //判断子类是否有MyAnnotation注解
            if (annotation instanceof MyAnnotation) {
                System.out.println("子类继承了父类的注解");
            }
        }
    }
}
