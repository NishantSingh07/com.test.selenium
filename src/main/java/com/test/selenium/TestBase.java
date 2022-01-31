package com.test.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class TestBase {

	WebDriver driver;
	static Logger logger = LogManager.getLogger(TestBase.class);
	//PropertyConfigurator.configure("C:\\Users\\GUR37160\\.git\\com.test.selenium\\src\\main\\java\\log4j.properties");	
	
	

	@BeforeSuite
	public void setupClass() {
		logger.info("Setting up Webdriver ....!");
		
		logger.warn("This is a warning msg");
		WebDriverManager.chromedriver().setup();
	}

	@BeforeTest
	public void setupTest() {
		// driver = new SafariDriver();
		
		logger.info("Setting up ChromeDriver ....!");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		}

	@Test(priority = 1)
	public void test() throws InterruptedException {
		logger.info("Fetching Website ....!");
		driver.get("https://tripadvisor.com");
		logger.info("Getting Title ....!");
		String title = driver.getTitle();
		System.out.println(title);
		logger.info("Locating WebElement ....!");
		driver.findElement(By.xpath("//a[@class='fGwNR _G B- z _S c Wc ddFHE fRPQK w fNnhN brHeh']")).click();
		Thread.sleep(3000);
		System.out.println("Click Success...");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"eBsLQ _R B- o\"]"));
		driver.switchTo().frame(frame);		
		System.out.println(driver.getTitle());
		
		JavascriptExecutor jse = ((JavascriptExecutor)driver);

		WebElement email = driver.findElement(By.xpath("//span[text()='Continue with email']"));
	
		jse.executeScript("arguments[0].click();", email);		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='regSignIn.email']")).sendKeys("nis.kr.singh@gmail.com");
		driver.findElement(By.xpath("//input[@id='regSignIn.password']")).sendKeys("Passw0rd12");
		Thread.sleep(1200);
		driver.findElement(By.xpath("//button[@class='ui_button primary coreRegPrimaryButton  regSubmitBtnEvent']"))
				.click();

		System.out.println(title);
		System.out.println("======================");
	
	}
	
	
	@Test(priority = 2)
	public void test2() throws InterruptedException {
		

		System.out.println("THIS IS TEST2");
		System.out.println("======================");
	
	}
	
	@Test(priority = 3)
	public void test3() throws InterruptedException {
		

		System.out.println("THIS IS TEST3");
		System.out.println("======================");
	
	}


	@AfterTest
	public void teardown() {

		driver.close();
		driver.quit();

	}
}
