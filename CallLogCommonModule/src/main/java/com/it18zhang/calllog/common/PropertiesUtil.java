package com.it18zhang.calllog.common;

import java.io.InputStream;
import java.util.Properties;

/**
 *
 */
public class PropertiesUtil {
    public static Properties loadProp(String path){
        try {
            InputStream in = ClassLoader.getSystemResourceAsStream(path);
            Properties prop = new Properties();
            prop.load(in);
            return prop ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null ;
    }

    public static String getProp(String path , String key){
        return loadProp(path).getProperty(key) ;
    }
}
