package com.powernode.final16;
class IMath{
    //静态常量（static final）
    public static final double PI = 3.14;
}
class CivilServant{
    public String name;
    public final String COUNTRY = "中国";

    /*public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }*/
}
public class Test {
    public static void main(String[] args) {
        //IMath.PI = 3.1415;Cannot assign a value to final variable 'PI'
        CivilServant civilServant = new CivilServant();
        civilServant.name = "zs";
        //civilServant.COUNTRY = "日本";java: 无法为 final 变量 COUNTRY 分配值
    }
}
