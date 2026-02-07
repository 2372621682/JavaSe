package com.powernode.private13;

class User{
    private String uname;
    private int password;


    public User setUname(String uname,User user) {
        this.uname = uname;
        return user;
    }

    public User setPassword(int password,User user) {
        this.password = password;
        return user;
    }
}

public class Test {
    public static void main(String[] args) {
       /* User user = new User();
        user.setUname("zs");
        user.setPassword(123);*/
       /* User user = new User();
        User user1 = user.setUname("zs", user);
        User user2 = user1.setPassword(123, user);

        System.out.println(user == user1);
        System.out.println(user1 == user2);*/
        User user = new User();
        user.setUname("zs", user).setPassword(123, user);

    }
}
