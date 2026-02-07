package com.powernode.writer02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        //1.确定文件写入路径
        String path = "./day21/src/fileTest.txt";
        FileWriter fileWriter = null;
        try {
            //2.创建文件写入对象，并建立写入通道
            fileWriter = new FileWriter(path);
            /**
             * 3.写入文件:
             *    1.清空文件
             *    2.写入缓存（通道）
             */
            fileWriter.write("hello world");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //4.关闭流
            //4.1清空缓存-物理写入
            //4.2关闭写入通道
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
