package com.powernode.reader01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) {
        //1.确定文件读取路径
        String path = "./day21/src/fileTest.txt";
        FileReader fileReader = null;
        try {
            //2.创建文件读取对象
            fileReader = new FileReader(path);
            //3.创建字符数组做缓存
            char[] cbuf = new char[2];
            //4.读取数据到缓存，返回读取的字符个数，读取完毕返回-1
            int read = fileReader.read(cbuf);
            while(read != -1){
                for (int i = 0; i < read; i++) {//读取几个输出几个
                    char c = cbuf[i];
                    System.out.println(c);
                }
                read = fileReader.read(cbuf);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
