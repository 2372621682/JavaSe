package com.powernode.reader01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            //1.创建一个文件读取对象，并指定需要读取的文件路径（建立了读取通道）
            fileReader = new FileReader("./day21/src1/fileTest.txt");
            //2.读取文件
            int read = fileReader.read();
            while(read != -1){
                System.out.println((char) read);
                read = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //3.关闭流
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
