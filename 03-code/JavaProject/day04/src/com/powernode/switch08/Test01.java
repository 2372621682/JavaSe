package com.powernode.switch08;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        int password = new Scanner(System.in).nextInt();
        switch (password){
            case 2009:
                System.out.println("普通员工");
                break;
            case 20092009:
                System.out.println("普通管理员");
                break;
        }
        /**
         * jdk新特性语法：
         *   1.冒号：替换为 ->
         *   2.删除break;
         */
        switch (password){
           /* case 2009->
                System.out.println("普通员工");
            case 20092009->
                System.out.println("普通管理员");*/
            case 2009-> System.out.println("普通员工");
            case 20092009-> System.out.println("普通管理员");
        }

    }
}
