package com.powernode.exercise01;

public class Test01 {
    public static void main(String[] args) {
        printCube();
    }
    /**
     * 1.语法：
     *     [修饰符]  返回类型  方法名称([形参列表]){
     *         方法体;
     *     }
     *     1.[修饰符] 站定为public static
     *     2.返回类型
     *       1.基本类型
     *       2.引用类型
     *       3.void:仅仅让方法执行
     *     3.方法名称：自定义，首单词小写，其余单词首字母大写
     *     4.[形参列表] ： 方法内部需要用到外部传入的数据，我们需要声明一个形参
     *
     */
    public static void printCube(){
        for (int i = 1; i < 6; i++) {
            System.out.println(i * i * i);
        }
    }
}
