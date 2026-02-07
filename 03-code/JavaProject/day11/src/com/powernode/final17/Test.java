package com.powernode.final17;


class CivilServant{
    public String name;
    public final String COUNTRY;
    //构造器中赋值
    /*public CivilServant(String COUNTRY, String name) {
        this.COUNTRY = COUNTRY;
        this.name = name;
    }*/
    //实例块中赋值
    {
        COUNTRY = "中国";
    }
}
public class Test {
}
