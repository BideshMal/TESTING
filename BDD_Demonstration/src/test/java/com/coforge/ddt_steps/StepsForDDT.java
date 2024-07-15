package com.coforge.ddt_steps;

import static org.junit.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsForDDT {
	WebDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	@After
	public void closedown() {
		driver.quit();
	}
	@Given
	("User on login page")
	public void user_on_login_page() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}


	@When("User Types {string} and {string}")
	public void user_types_and(String string, String string2) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string2);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("Validate the login status")
	public void validate_the_login_status() {
		boolean error_status = driver.findElement(By.xpath("//div[@id='error']")).isDisplayed();
	    assertFalse(error_status);
	}


}
