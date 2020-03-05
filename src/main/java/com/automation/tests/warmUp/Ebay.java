package com.automation.tests.warmUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
    public static void main(String[] args) throws Exception{
ebayTest();
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

    public static void AmazonTest(){

    }

    public static void wikipediaTest(){

    }
}
