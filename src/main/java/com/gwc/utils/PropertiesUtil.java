package com.gwc.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by GWCheng on 2016/1/10.
 */
public class PropertiesUtil {
    private static Properties props = new Properties();

    /**
     * 加载配置文件
     * @param fileName
     */
    public static void loadProperties(String fileName){
        InputStream is = PropertiesUtil.class.getResourceAsStream("/"+fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        try {
            props.load(br);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据key读取对应的value
     * @param key
     * @return
     */
    public static String getProperty(String key){
        return props.getProperty(key);
    }

}
