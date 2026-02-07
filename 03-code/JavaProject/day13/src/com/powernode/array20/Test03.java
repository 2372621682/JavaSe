package com.powernode.array20;

public class Test03 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};

        /**
         * 1.语法：for(数据类型 变量名称:数组名称){}
         * 2.执行过程：通过数组名称，拿到数组中的每个元素依次给变量名称赋值
         */
        for(int i:ints){
            System.out.println(i);
        }

    }

}
