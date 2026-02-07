package com.powernode.switch08;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        String week = new Scanner(System.in).next();
        switch (week){
            case "星期一","星期二","星期四","星期五","星期六" ->{
                System.out.println("上课");
                System.out.println("上自习");
            }
            case "星期三" -> System.out.println("上自习");
            case "星期日" -> System.out.println("休息");
            default -> System.out.println("输入数据不合法");
        }
    }
}
