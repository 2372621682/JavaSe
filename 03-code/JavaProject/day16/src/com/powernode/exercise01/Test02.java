package com.powernode.exercise01;

public class Test02 {
    public static void main(String[] args) {
        String[][] strings = {
                {"1a", "1b", "1c", "1d", "1f"},
                {"2g", "2h", "2i", "2j", "2k"},
                {"3m", "3n", "3o", "3p", "3q"}
        };
        for (String[] string : strings) {
            for (String s : string) {
                System.out.println(s);
            }
        }
        System.out.println("-------------------");
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.print("row" + (i+1) + ":" + strings[i][j] + "\t");
            }
            System.out.println();
        }



    }
}
