package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Exception {


        //to start selenium script we need:
        //setup webdriver (browser driver) and create webdriver object

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //in selenium everyting starts from WebDriver interface
        //Chromedriver extends RemoteWebdriver__> implements Webdriver
        driver.get("http://google.com");
        Thread.sleep(3000);//wait 3 seconds

        driver.manage().window().maximize(); // to maximize browser
        Thread.sleep(3000);//wait 3 seconds

        String title=driver.getTitle();// returns title of the page <title> some title<?title>

        String expectedTitle="Google";
        System.out.println("Title is "+title);

        if(expectedTitle.equals(title)){
            System.out.println("Title Test Passed");
        }else{
            System.out.println("Title Test Failed");
        }
        Thread.sleep(3000);//wait 3 seconds

        if(driver.getTitle().toLowerCase().contains("amazon")){
            System.out.println("Test passed");
        }else{
            System.out.println("test fails");
        }
        Thread.sleep(3000);//wait 3 seconds

        driver.navigate().to("http://amazon.com");
        //browser cannot close itself
        verifEquals(driver.getTitle(),"Google");
        //move forward in the browser
        driver.navigate().forward();
        Thread.sleep(3000);//wait 3 seconds


        System.out.println("driver.getTitle() = " + driver.getTitle());
        Thread.sleep(3000);//wait 3 seconds

        driver.navigate().back();
        Thread.sleep(3000);//wait 3 seconds

        driver.navigate().refresh();

        driver.close();
    }
    public static void verifEquals(String arg1,String arg2){
        if (arg1.equals(arg2)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
    }
}