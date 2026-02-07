package com.powernode.annotation07;
enum MyEnum{
    ONE,TWO,THREE
}
@interface MyInnotation02 {
    String name();
}
public @interface MyInnotation01 {
    /**
     * - 注解可以使用的数据类型
     *    1.基本类型
     *    2.引用类型：String,Class,enum,注解
     *    3.以上类型的数组
     */
    //1.基本类型
    byte b();
    short s();
    int i();
    long l();

    float f();
    double d();

    char c();

    boolean bool();

    //2.引用类型
    String str();
    Class<?> clazz();
    MyEnum myEnum();
    MyInnotation02 myInnotation02();

    //3.以上类型的数组
    String[] strs();
    Class<?>[] clazzs();
    MyEnum[] myEnums();
    MyInnotation02[] myInnotation02s();

}
class Test{
    @MyInnotation01(
            b = 10,s = 20,i = 30,l = 40,f = 50.5f,d = 60.6,c = 'a',bool = true,
            str = "hello",clazz = String.class,myEnum = MyEnum.ONE, myInnotation02 = @MyInnotation02(name = "张三"),
            strs = {"hello","world"},clazzs = {String.class,Integer.class},myEnums = {MyEnum.ONE,MyEnum.TWO},
            myInnotation02s = {@MyInnotation02(name = "张三"),@MyInnotation02(name = "张三")}
    )
    public void method(){

    }
}
