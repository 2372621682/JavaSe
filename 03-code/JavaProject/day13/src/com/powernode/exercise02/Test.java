package com.powernode.exercise02;

class CEO{
    private CEO(){}

    private static CEO ceo = new CEO();

    public static CEO getCeo() {
        return ceo;
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println(CEO.getCeo());
        System.out.println(CEO.getCeo());
    }
}
