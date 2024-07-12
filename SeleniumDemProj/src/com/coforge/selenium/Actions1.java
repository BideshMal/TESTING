package com.coforge.selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
	
	  public static WebDriver driver;

	    public static void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }
	    
	    
	    public static void main(String[] args) {
	        // open the Browser
	       // WebDriver driver = new ChromeDriver();
	        // open the page
	    	setup();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("http://www.google.com");
	        // click on link "Click Here" and perform click in WebElement Type
//	        Actions action = new Actions(driver);
//	        WebElement e1 = driver.findElement(By.linkText("Click Here"));
//	        action.moveToElement(e1).perform();
//	        
//	        if(e1.isDisplayed())
//	            e1.click();
//	        
//	        // Move the mouse over to "Computer" and store it in WebElement Type
//	        WebElement e2 = driver.findElement(By.linkText("Computer"));
//	        
//	        // Move to element e2 ("Computer") and perform click of WebElement Type
//	        action.moveToElement(e2).click().perform();
	        
	       // Close the Browser
	       driver.close();

	    }
	}


