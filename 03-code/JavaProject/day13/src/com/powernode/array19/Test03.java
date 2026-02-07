package com.powernode.array19;

public class Test03 {
    public static void main(String[] args) {
       //1.语法：数据类型 [] 数组名称 = new 数据类型[长度]
        int[] ints = new int[3];
        //int ints1 [] = new int[3];不推荐使用
        //2.向数组中存数据
        ints[0] = 3;
        ints[1] = 4;
        ints[2] = 5;
        /**
         * 数组下标越界异常：
         *   1.ArrayIndexOutOfBoundsException:数组越界（用非法索引访问数组时抛出的异常）
         *   2.什么原因造成的，超出了下标的取值范围
         *     1.new int[3] ,下标的取值范围[0,2],包含0和2
         *     2.ints[3] 不在取值范围[0,2]内，所以报错
         *   3.出现了错误，JVM终止工作，出现异常后的代码无法执行
         */
        //ints[3] = 6;

        //3.从数组中存数据
        System.out.println("ints[0] = " + ints[0]);
        System.out.println("ints[1] = " + ints[1]);
        System.out.println("ints[2] = " + ints[2]);
        System.out.println("-----------------");
        int[] array = new int[3];
        array = null;
        //.NullPointerException
        array[1] = 2;

    }
}
