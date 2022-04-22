package com.test.selenium;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        String date;
        Date d= new Date();
        long time = d.getTime();

        System.out.println(time);
    }
}
