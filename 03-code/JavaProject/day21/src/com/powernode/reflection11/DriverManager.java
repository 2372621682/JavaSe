package com.powernode.reflection11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Scanner;

public class DriverManager {
    static {
        String[] nameAndPwdByConfigFile = AnalysisConfigFile.getNameAndPwdByConfigFile();
        String name = nameAndPwdByConfigFile[0];
        String pwd = nameAndPwdByConfigFile[1];

        //拿到配置文件中的数据类
        String dbType = AnalysisConfigFile.getDBType();
        try {
            Class<?> aClass = Class.forName(dbType);
            Object o = aClass.newInstance();
            Method method = aClass.getDeclaredMethod("getConnection", String.class, String.class);
            method.invoke(o, name, pwd);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }


    }
}
