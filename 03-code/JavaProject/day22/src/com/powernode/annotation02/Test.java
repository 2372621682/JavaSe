package com.powernode.annotation02;
class DBUtil{
    /**
     * 1.语法：@Deprecated(属性 = 值,属性 = 值)
     * 2.@Deprecated  不推荐使用|弃用，用于标记某个类，方法，属性或者接口等元素，不推荐使用
     * 3.since 属性：指定该元素从哪个版本开始被弃用，默认为1.0
     * 4.forRemoval属性：指定该元素是否在将来的版本中被移除，默认为false
     */
    @Deprecated(since = "1.8",forRemoval = true)
    public static void getConnection(){
        System.out.println("获得数据库连接");
    }
}
public class Test {
    public static void main(String[] args) {
        DBUtil.getConnection();
    }
}
