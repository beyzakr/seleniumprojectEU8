package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1- set up the browser driver

        WebDriverManager.chromedriver().setup();

        //2- create instance selenium web driver
        // this is the line opening and empty browser
        WebDriver driver = new ChromeDriver();

        //3- go to http://www.tesla.com
        driver.get("http://www.tesla.com");

        // stop code execution for 3 minutes
        Thread.sleep(3000);

        // use selenium to navigate back

        driver.navigate().back();

        // stop code execution for 3 seconds
        Thread.sleep(3000);


        // use selenium to navigate forward
        driver.navigate().forward();

        // stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate refresh
        driver.navigate().refresh();

        // stop code execution for 3 seconds
        Thread.sleep(3000);

        //use navigate().to;
        driver.navigate().to("http://www.google.com");


        // get the title of the page
        System.out.println("driver.getTitle() = " + driver.getTitle());


    }

}
