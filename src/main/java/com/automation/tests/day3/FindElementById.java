package com.automation.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TransferQueue;

public class FindElementById {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");

        driver.findElement(By.name(("username"))).sendKeys("tomsmith");

        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");

        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(2000);

        String expected ="Welcome to the Secure Area. When you are done click logout below.";
        String actual = driver.findElement(By.tagName("h4")).getText();

        if(expected.equalsIgnoreCase(actual)){
            System.out.println("\"test Passed\" = " + "test Passed");
        }else{
            System.out.println("\"test Failed\" = " + "test Failed");
        }

        //every link element has <a> tag
        //partialLinkText - contains() -complete match does not require.
        //don't put space.

        WebElement logout= driver.findElement(By.linkText("Logout"));

        logout.click();

        Thread.sleep(2000);

        String href =logout.getAttribute("href");
        String classname =logout.getAttribute("class");


        System.out.println(href);
        System.out.println(classname);


        driver.findElement(By.name(("username"))).sendKeys("wrongusername");

        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("wrongpassword");

        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(2000);

         WebElement errorMessage= driver.findElement(By.id("flash-messages"));

        System.out.println(errorMessage.getText());

        Thread.sleep(3000);

        logout.click();
        Thread.sleep(2000);




        //driver.quit();

    }
}
