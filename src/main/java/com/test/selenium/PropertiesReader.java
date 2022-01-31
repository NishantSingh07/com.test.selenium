package com.test.selenium;
import java.io.FileReader;
import java.util.Properties;

public class PropertiesReader {
	public static void main(String[] args) {

		String path1 = System.getProperty("user.dir") + "\\src\\main\\java\\config.properties";

		try {
			FileReader fs = new FileReader(path1);
			Properties p = new Properties();
			p.load(fs);
			System.out.println("App URL is " + "\t" + p.getProperty("url"));
			System.out.println("User Name is " + "\t" + p.getProperty("uname"));
			System.out.println("Password is  " + "\t" + p.getProperty("password"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}