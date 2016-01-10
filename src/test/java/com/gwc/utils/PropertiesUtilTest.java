package com.gwc.utils;


import org.junit.Test;

/**
 * Created by GWCheng on 2016/1/10.
 */
public class PropertiesUtilTest {
    @Test
    public void testGetProperty(){
        PropertiesUtil.loadProperties("test.properties");
        System.out.println(PropertiesUtil.getProperty("username"));
        System.out.println(PropertiesUtil.getProperty("password"));
        System.out.println(PropertiesUtil.getProperty("city"));
    }
}