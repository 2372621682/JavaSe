package com.powernode.backup03;

import java.io.*;

public class Test03 {
    public static void main(String[] args) {
        //1.确定文件读写路径
        String sourcePath = "D:\\powernode\\02-JavaSE\\04-video\\day01\\01-认识Java语言.mp4";
        String targetPath = "D:\\01-认识Java语言.mp4";


        try(
                //2.创建文件读写对象
                FileInputStream fileInputStream = new FileInputStream(sourcePath);
                FileOutputStream fileOutputStream = new FileOutputStream(targetPath);
        ) {
                //3.提供缓存
            byte[] bbuf = new byte[1024];
            //4.读取文件
            int read = fileInputStream.read(bbuf);
            while(read!=-1){
                //5.写入文件
                fileOutputStream.write(bbuf,0,read);
                read = fileInputStream.read(bbuf);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
