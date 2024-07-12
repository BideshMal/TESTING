package com.coforge.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImpliExpliWait {
    public static WebDriver driver;

    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void main(String[] args) {
        setup();

        // Apply implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            driver.get("https://www.google.com");

            // Find an element using implicit wait
            WebElement element = driver.findElement(By.name("q")); // Changed to a valid element ID
            System.out.println("Element found using implicit wait: " + element.getAttribute("title"));

            // Apply explicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement explicitWaitElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK"))); // Changed to a valid element ID
            System.out.println("Element found using explicit wait: " + explicitWaitElement.getAttribute("value"));

        } finally {
            driver.quit();
        }
    }
}
