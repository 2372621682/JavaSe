package com.powernode.annotation09;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 1.@Retention 配置注解的保留策略
 * 2.RetentionPolicy，保留策略的取值：
 *    1.SOURCE：在源文件中保留，编译时注解丢失
 *    2.CLASS：在class文件中保留，运行时注解丢失
 *    3.RUNTIME：在运行时保留，可通过反射获取注解信息
 *    4.注解默认的保留策略是CLASS
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {

}
public class Test {
    @Override
    public String toString() {
        return super.toString();
    }
}
