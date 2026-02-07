package com.powernode.private12;

class User{
    private String uname;
    private int password;

    /*public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPassword(int password) {
        this.password = password;
    }*/
    public User setUname(String uname) {
        this.uname = uname;
        return this;
    }

    public User setPassword(int password) {
        this.password = password;
        return this;
    }
}

public class Test {
    public static void main(String[] args) {
       /* User user = new User();
        user.setUname("zs");
        user.setPassword(123);*/
        /*User user = new User();
        user.setUname("zs").setPassword(123);*/
        //使用链式调用可以解决，匿名对象只用一次的问题
        new User().setUname("zs").setPassword(123);


    }
}
