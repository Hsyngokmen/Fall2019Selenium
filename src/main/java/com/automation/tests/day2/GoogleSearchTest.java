package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");
        Thread.sleep(2000);
        //This one look for some element where name is equals to q
        WebElement search=driver.findElement(By.name("q"));

        //after finding element we'll enter the test
        search.sendKeys("java", Keys.ENTER);

        //<a> element calls link

        Thread.sleep(2000);


        driver.quit();

    }
}
