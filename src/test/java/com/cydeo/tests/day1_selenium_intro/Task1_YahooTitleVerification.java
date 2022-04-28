package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        // do set up for browser driver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        // make our page fullscreen
        driver.manage().window().maximize();

        driver.get("http://www.yahoo.com");

        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports &amp; Videos";

        //actual title comes from the browser
        String  actualTitle  = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected.Verification PASSED!");
        }else{
            System.out.println("Title is as not expected.Verification FAILED!");
        }
    }

}
