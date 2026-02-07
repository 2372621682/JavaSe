package com.powernode.switch08;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        /**
         * 公司抽奖
         *   一等奖：100w
         *   二等奖：50w
         *   三等奖：10w
         *   其他：0w
         *  输入几等奖，返回奖金金额
         */
        int bonus = new Scanner(System.in).nextInt();
        int money = switch (bonus) {
            case 1 -> 100;
            case 2 -> 50;
            case 3 -> 10;
            default -> 0;//switch作为表达式返回一个结果是必须，写上default
        };
    }
}
