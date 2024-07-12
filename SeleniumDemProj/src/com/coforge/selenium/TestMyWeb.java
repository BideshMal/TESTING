package com.coforge.selenium;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestMyWeb {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\Training\\eclipse-workspace\\DemoTestNg\\SeleniumDemProj\\src\\index2.html");
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.dismiss();
		
		driver.findElement(By.linkText("GoToGoogle")).click();
		driver.findElement(By.linkText("GoToYahoo")).click();
		driver.findElement(By.linkText("GoToRediff")).click();
		
		String parWin=driver.getWindowHandle();
		Set<String>wins =driver.getWindowHandles();
		int i=0;
		for(String win:wins) {
			i++;
			if(i==1) {
				driver.switchTo().window(win);
				System.out.println(driver.getTitle());
				break;
			}
		}
		driver.switchTo().window(parWin);
		WebElement dropdownElement = driver.findElement(By.id("myDropdown"));

		
		Select dropdown = new Select(dropdownElement);

		
		dropdown.selectByVisibleText("Option 2");

		
		WebElement selectedOption = dropdown.getFirstSelectedOption();
		System.out.println("Selected option: " + selectedOption.getText());

		driver.quit();
	}
}
