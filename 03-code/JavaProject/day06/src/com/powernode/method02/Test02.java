package com.powernode.method02;

public class Test02 {
    public static void main(String[] args) {

        /**
         * 方法的调用:
         *   1.方法名称();
         *   2.main方法和自定义的方法，必须在同一个类
         *   3.定义的方法使用static修饰，且没有形参
         */
        System.out.println("------printRectangles方法即将执行------");
        printRectangles();
        System.out.println("------printRectangles方法执行完毕------");
    }
    /**
     * [修饰符] 返回类型  方法名称([形参列表]){
     *     方法体;
     * }
     * 1.[修饰符] ： 暂定为public static
     * 2.返回类型：void 仅仅让方法执行
     * 3.方法名称可以自定义
     * 4.[形参列表] 先不写
     * 5.注意：
     *   1.方法编写的位置
     *     1.写到类中，方法外面
     *     2.和main方法并列
     */
    public static void printRectangles(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
