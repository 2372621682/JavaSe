package com.powernode.api13;

import javax.xml.crypto.dom.DOMCryptoContext;

public class Test01 {
    public static void main(String[] args) {
        /**
         *   - 装箱：基本类型  --> 包装类
         *     - 自动装箱
         *     - 手动装箱
         *   - 拆箱：包装类 --> 基本类型
         *     - 自动拆箱
         *     - 手动拆箱
         */
        //1.装箱：基本类型  --> 包装类
        Integer i = 123;//自动装箱
        String str = "123";
        Integer i1 =  Integer.valueOf(str);//手动装箱
        System.out.println("-----------");
        //2.拆箱：包装类 --> 基本类型
        Integer i2 = 123;
        int x = i2;//自动拆箱
        Double d = 1.1;
        int i3 = d.intValue();//手动拆箱
        //3.包装类提供了其他的方法
        System.out.println(Integer.max(2,3));
        //把字符串转换为整数
        int i4 = Integer.parseInt("123");
    }
}
