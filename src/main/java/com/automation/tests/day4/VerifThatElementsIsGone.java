package com.automation.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class VerifThatElementsIsGone  {
    public static void main(String[] args) throws Exception{

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        Thread.sleep(2000);

        driver.findElement(By.id("disappearing_button")).click();
        Thread.sleep(2000);

        if (driver.findElements(By.id("disappearing_button")).size() ==0){
            System.out.println("\"Test passed\" = " + "Test passed");

        }else{
            System.out.println("\"test failed\" = " + "test failed");
        }

        Thread.sleep(2000);

        //to find al buttons
        List<WebElement> buttons =driver.findElements(By.tagName("button"));

        for (WebElement button: buttons){
           //click on every buttons.
            button.click();
            Thread.sleep(2000);

        }

        driver.quit();

    }
}
