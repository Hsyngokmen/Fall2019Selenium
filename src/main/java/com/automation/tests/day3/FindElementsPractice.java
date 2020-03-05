package com.automation.tests.day3;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementsPractice {
    public static void main(String[] args) throws Exception {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = DriverFactory.createadriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullName=driver.findElement(By.name("full_name"));
        fullName.sendKeys("Tester");

        Thread.sleep(2000);

        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("mavi1982@gmail.com");

        Thread.sleep(2000);

        WebElement signUp=driver.findElement(By.name("wooden_spoon"));

       //when submit available you can use instead of click()
        //it make sense to use when click does not work.
        signUp.click();

        Thread.sleep(2000);

        String expected="Thank you for signing up. Click the button below to return to the home page.";

        WebElement message =driver.findElement(By.className("subheader"));

        String actual = message.getText();

        if(expected.equalsIgnoreCase(actual)){
            System.out.println("\"test Passed\" = " + "test Passed");
        }else{
            System.out.println("\"test Failed\" = " + "test Failed");
        }





        driver.quit();




    }
}
