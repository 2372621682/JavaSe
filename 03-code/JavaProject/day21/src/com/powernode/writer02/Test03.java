package com.powernode.writer02;

import java.io.FileWriter;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {
        //1.确定文件写入路径
        String path = "./day21/src/fileTest.txt";
        FileWriter fileWriter = null;
        try {
            //2.创建文件写入对象
            fileWriter = new FileWriter(path,true);//true表示追加内容到文件末尾处（续写）
            //3.写入文件
            fileWriter.write("\n下班去哪里玩？");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (fileWriter!=null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
