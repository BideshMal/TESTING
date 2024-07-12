package com.coforge.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;




public class GoogleHyperlinks {
	
	public static WebDriver driver;
	public static void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	}
	
    public static void main(String[] args) {
    	setup();

        try {
            driver.get("https://www.google.com");

            List<WebElement> links = driver.findElements(By.tagName("a"));

            System.out.println("Number of hyperlinks on the page: " + links.size());

            for (WebElement link : links) {
                System.out.println("Link Text: " + link.getText());
                System.out.println("Link URL: " + link.getAttribute("href"));
            }

            
            if (!links.isEmpty()) {
                WebElement lastLink = links.get(links.size() - 1);
                lastLink.click();
                System.out.println("Clicked on the last link: " + lastLink.getAttribute("href"));
            } else {
                System.out.println("No hyperlinks found on the page.");
            }
        } finally {
            driver.quit();
        }
    }
}
