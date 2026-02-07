package com.powernode.properties02;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class Test {
    public static void main(String[] args) {
        //加载默认语言的配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("com/powernode/properties02/info");//不需要添加.properties
        String name = bundle.getString("name");
        String pwd = bundle.getString("pwd");
        System.out.println(name);
        System.out.println(pwd);

        //java.util.MissingResourceException
        Enumeration<String> keys = bundle.getKeys();
        while(keys.hasMoreElements()){
            System.out.println(keys.nextElement());
        }
    }
}
