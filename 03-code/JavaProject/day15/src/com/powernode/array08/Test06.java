package com.powernode.array08;

public class Test06 {
    public static void main(String[] args) {
        String[][] strings = {
                {"a", "b", "c"},
                {"d", "e", "f"}
        };
        /**
         * 输出的结果：
         *   row1:a   row1:b   row1:c
         *   row2:d   row2:e   row2:f
         */
        for (int i = 0; i < strings.length; i++) {//外层循环控制行
            String[] string = strings[i];
            for (int j = 0; j < string.length; j++) {//内层循环控制列
                String s = string[j];
                System.out.print("row" + (i + 1) + ":" + s + "\t");
            }
            System.out.println();
        }


    }
}
