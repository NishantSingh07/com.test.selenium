package com.test.selenium;
import java.io.FileReader;
import java.util.Properties;

import org.checkerframework.checker.units.qual.s;
public class PropertiesReader {
    public static void main(String[] args) {

        String path="/Users/nishant/Desktop/Java/proj/src/main/java/com/application/myapp/Config.properties";
        try {
            FileReader fs = new FileReader(path);
            Properties p = new Properties();
            p.load(fs);
            System.out.println("App URL is " + "\t" +  p.getProperty("url"));
            System.out.println("User Name is " + "\t" +  p.getProperty("uname"));
            System.out.println("Password is  " + "\t" +  p.getProperty("password"));

        }
        catch (Exception e) {
            e.printStackTrace();
            
        }

    }
}