package com.powernode.class05;

public class DefaultValue {
    //基本类型
    byte b;
    short s;
    int i;
    long l;

    char c;//\u0000

    float f;
    double d;

    boolean flag;// false
    //引用类型
    String str;// null

    public static void main(String[] args) {
        DefaultValue dv = new DefaultValue();
        System.out.println("dv.b = " + dv.b);
        System.out.println("dv.s = " + dv.s);
        System.out.println("dv.i = " + dv.i);
        System.out.println("dv.l = " + dv.l);

        System.out.println("dv.c = " + dv.c);

        System.out.println("dv.f = " + dv.f);
        System.out.println("dv.d = " + dv.d);

        System.out.println("dv.flag = " + dv.flag);

        System.out.println("dv.str = " + dv.str);
    }
}
