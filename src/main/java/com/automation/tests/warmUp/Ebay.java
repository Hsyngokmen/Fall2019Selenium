package com.automation.tests.warmUp;

import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

    static WebDriver driver;

    public static void main(String[] args) throws Exception{
//ebayTest();
AmazonTest();
    }

    public static void ebayTest() throws Exception{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.get("http://ebay.com");
        Thread.sleep(2000);

        WebElement searchBox= driver.findElement(By.name("_nkw"));
        Thread.sleep(2000);

        searchBox.sendKeys("computer");
        Thread.sleep(2000);

        WebElement click=driver.findElementById("gh-btn");
        Thread.sleep(2000);

        click.click();

        WebElement result=driver.findElement(By.tagName("h1"));

        System.out.println(result.getText());


    }

    public static void AmazonTest() throws Exception{

        driver = DriverFactory.createadriver("chrome");
        driver.get("http://amazon.com");
        //enter text and click ENTER
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book", Keys.ENTER);

        Thread.sleep(2000);//to wait 2 seconds

        String title = driver.getTitle();
        if(title.contains("java book")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }
        driver.quit();

    }

    public static void wikipediaTest(){

    }
}
