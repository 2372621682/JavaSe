package com.powernode.reflection11;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 1.应用案例：
         *   1.服务器启动后，通过用户名和密码自动连接数据库
         *   2.支持数据库的切换
         *   3.如上操作，不能修改代码，只允许在配置文件中修改。
         * 2.main方法运行相当于服务器启动
         */
        Class.forName("com.powernode.reflection11.DriverManager");
    }
}