package com.powernode.backup03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        /**
         * - 文件备份，copy一个副本
         *    1.读取文件
         *    2.创建目标文件
         *    3.写入目标文件
         */
        //1.确定读写文件路径
        String sourcePath = "./day21/src/com/powernode/backup03/Test01.java";
        String targetPath = sourcePath + ".bak";
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //2.创建文件读写对象
            fileReader = new FileReader(sourcePath);
            fileWriter = new FileWriter(targetPath);
            //3.创建一个字符串数组缓存
            char[] cbuf = new char[500];
            int read = fileReader.read(cbuf);
            while(read!=-1){
                //5.写入文件
                fileWriter.write(cbuf,0,read);
                read = fileReader.read(cbuf);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //6.关闭流（先创建后关闭）
            if (fileWriter!= null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fileReader!= null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
