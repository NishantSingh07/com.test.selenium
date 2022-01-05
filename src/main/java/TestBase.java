import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

public class TestBase  {

    WebDriver driver;

    @BeforeSuite
    public void setupClass() {
        WebDriverManager.safaridriver().setup();
    }

    @BeforeTest
    public void setupTest() {
        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
      //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://tripadvisor.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.findElement(By.xpath("//a[@class='fGwNR _G B- z _S c Wc ddFHE fRPQK w fNnhN brHeh']")).click();
        Thread.sleep(3000);
        System.out.println("Click Success...");
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        String subWindowHandler=null;
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler);// switch to popup window
        System.out.println(subWindowHandler);
        Thread.sleep(1200);

        // Now you are in the popup window, perform necessary actions here

        driver.findElement(By.xpath("//span[text()='Continue with email']")).click();
        driver.findElement(By.xpath("//input[@id='regSignIn.email']")).sendKeys("nis.kr.singh@gmail.com");
        driver.findElement(By.xpath("//input[@id='regSignIn.password']")).sendKeys("Passw0rd12");
        Thread.sleep(1200);
        driver.findElement(By.xpath("//button[@class='ui_button primary coreRegPrimaryButton  regSubmitBtnEvent']")).click();
        //driver.switchTo().window(parentWindowHandler);  // switch back to parent window

        System.out.println(title);
        System.out.println("======================");
      //  System.out.println(reader.getCellData("Sheet1","Name",2));
    }

    @AfterTest
    public void teardown() {

        driver.close();
        driver.quit();

    }
}

