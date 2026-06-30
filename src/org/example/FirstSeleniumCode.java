package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumCode {
    public static void main(String[] args) throws InterruptedException
    {

        System.out.println("System: Initializing the WebDriver...");

        // 1. Open a new Chrome Browser window
        WebDriver driver = new ChromeDriver();

        // 2. Maximize the window
        driver.manage().window().maximize();

        // 3. Navigate to a website
        System.out.println("System: Navigating to Amazon...");
        driver.get("https://www.amazon.in");

        // 4. Extract data from the website
        String pageTitle = driver.getTitle();
        System.out.println("Success! The page title is: " + pageTitle);
        Thread.sleep(2000);

        // 5. Clean up and close the browser
        driver.quit();
        System.out.println("System: Browser closed cleanly.");

        char c[] = {'A', 'B', 'C', 'D'};
        String str = new String(c);
        byte b[] = {65, 66,67,68};
        String str1 = new String(b);

        System.out.println(str);
        System.out.println(str1);


    }
}