package com.automation.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScpript {
    public static void main(String[] args) {
        //setup websrider
        WebDriverManager.chromedriver().setup();


        //create chromeDriver pbject
        ChromeDriver driver = new ChromeDriver();

        //open some website
        driver.get("https://www.google.com/");
    }
}
