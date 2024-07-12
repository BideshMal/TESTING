package com.coforge.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestGoogleDotCom {
    public static WebDriver driver;

    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
    }

    public static void getApp(String url) {
        driver.get(url);
        System.out.println(driver.getTitle());
    }

    public static void navigation() throws InterruptedException {
        driver.navigate().back();
        Thread.sleep(30);
        driver.navigate().forward();
        Thread.sleep(30);
    }

    public static void search(String searchKey) throws Exception {
        driver.findElement(By.id("APjFqb")).sendKeys(searchKey);
        driver.findElement(By.id("APjFqb")).submit();
        System.out.println("On the search result page: " + driver.getTitle());
        driver.findElement(By.partialLinkText("Shop With Bidesh")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Signin']")).click();
    }

    public static void fillForm() throws InterruptedException {
       
        driver.findElement(By.id("firstName")).sendKeys("BIDESH");

     
        driver.findElement(By.id("lastName")).sendKeys("MAL");

        driver.findElement(By.id("email")).sendKeys("bideshmalofficial@gmail.com");

       
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='demo-simple-select']"));
        dropdown.click();
        WebElement admin =driver.findElement(By.xpath("//*[@id=\"menu-role\"]/div[3]/ul/li[1]"));
        admin.click();

        driver.findElement(By.id("password")).sendKeys("password123");

        
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/form/div/div[6]/button")).click();
        
    }

    public static void main(String[] args) throws Exception {
        setup();
        getApp("https://google.com");
        search("https://ecommerce-bidesh"
        		+ ""
        		+ ""
        		+ ""
        		+ ""
        		+ ""
        		+ ""
        		+ ".vercel.app/");
        fillForm();
        navigation();
    }
}
