package com.powernode.exception08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test01 {
    public static void main(String[] args) {
        try {
            fileReader();
        } catch (FileNotFoundException e) {
            System.out.println("文件没找到");
        }
    }
    //方法声明处抛出异常
    public static void fileReader()throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("文件地址");
    }
}
