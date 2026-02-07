package com.powernode.switch06;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        int password = new Scanner(System.in).nextInt();
        if (password > 2009) {
            System.out.println("开门");
        }
        /**
         * 1.if 使用的 <布尔表达式>，switch使用的是<表达式>
         * 2.if可以做范围判断，switch只能做等值判断
         * 3.if比switch更加灵活
         * 4.switch比if效率更高(？)
         */
        //double d = 1.2;
        switch(password){
            case 2009:
                System.out.println("开门");
        }
    }
}
