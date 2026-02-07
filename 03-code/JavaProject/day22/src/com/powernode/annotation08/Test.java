package com.powernode.annotation08;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Target元注解：可以标注自定义注解，告诉JVM这个注解可以放在哪个位置
 *     TYPE,
 *     FIELD,
 *     METHOD,
 *     PARAMETER,
 *     CONSTRUCTOR,
 *     LOCAL_VARIABLE,
 *     ANNOTATION_TYPE,
 *     PACKAGE,
 *     TYPE_PARAMETER,
 *     TYPE_USE,
 *     MODULE,
 *     RECORD_COMPONENT
 *
 *     1.ElementType.TYPE：可以放在类上(重点)
 *     2.ElementType.FIELD：可以放在属性上(重点)
 *     3.ElementType.METHOD：可以放在方法上(重点)
 *     4.ElementType.CONSTRUCTOR：可以放在构造方法上(重点)
 *     5.ElementType.PARAMETER：可以放在参数上(重点)
 *     6.ElementType.ANNOTATION_TYPE：可以放在注解上(重点)
 *     7.ElementType.LOCAL_VARIABLE：可以放在局部变量上(重点)
 *
 *     8.ElementType.PACKAGE：可以放在包上
 *     9.ElementType.TYPE_PARAMETER：可以放在类型参数上
 *     10.ElementType.TYPE_USE：可以放在类型使用上
 *     11.ElementType.MODULE：可以放在模块上
 *     12.ElementType.RECORD_COMPONENT：可以放在记录组件上
 *
 *
 */
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.CONSTRUCTOR})
@interface MyAnnotation {

}

@MyAnnotation
public class Test {
    @MyAnnotation
    String name;
    @MyAnnotation
    public Test(String name) {
        this.name = name;
    }
    @MyAnnotation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
