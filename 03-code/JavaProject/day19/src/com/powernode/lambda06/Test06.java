package com.powernode.lambda06;

import com.powernode.lambda04.Function;

class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Test06 {
    public static void main(String[] args) {
        Function<User, String> function = new Function<>() {
            @Override
            public String apply(User user) {
                return user.getName();
            }
        };

        Function<User, String> function1 = User::getName;

    }


}
