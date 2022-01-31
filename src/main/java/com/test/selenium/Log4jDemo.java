package com.test.selenium;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log4jDemo {	
	 
	   static Logger logger = LogManager.getLogger(Log4jDemo.class);	   
	    
	 
	    public static void main(String[] args) {
	    	System.setProperty("log4j.configurationFile","C:\\Users\\GUR37160\\.git\\com.test.selenium\\log4j2.properties");   	
	
	       	logger.debug("this is a debug log message");
	        logger.info("this is a information log message");
	        logger.warn("this is a warning log message");
	    }
	 
	}


