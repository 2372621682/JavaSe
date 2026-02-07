package com.powernode.reflection11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//解析配置文件
public class AnalysisConfigFile {
    private static String path = "./day21/src/com/powernode/reflection11/config.properties";
    /**
     * 获得用户名和密码
     * @return
     */
    public static String [] getNameAndPwdByConfigFile(){

        try (
                //1.创建文件读取对象，并指定需要读取的文件
                FileInputStream fileInputStream = new FileInputStream(path);
        ){
            //2.创建Propetries对象
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String name = properties.getProperty("db.uname");
            String pwd = properties.getProperty("db.pwd");
            String [] str = {name,pwd};
            return str;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getDBType() {

        try (
                FileInputStream fileInputStream = new FileInputStream(path);
        ){
            Properties properties = new Properties();
            properties.load(fileInputStream);
            return properties.getProperty("db.type");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
