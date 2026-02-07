package com.powernode.reflection11;

public class OracleDriver {
    public boolean getConnection(String name,String pwd){
        //如果配置文件中的用户名和密码与数据库中的用户名和密码匹配上就可以登录成功
        if (name.equals("root") && pwd.equals("123")) {
            System.out.println("Oracle登录成功！");
            return true;
        }
        System.out.println("Oracle登录失败！");
        return false;
    }
}
