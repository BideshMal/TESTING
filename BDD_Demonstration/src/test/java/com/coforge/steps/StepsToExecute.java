package com.coforge.steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Tha;

public class StepsToExecute {
	WebDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	@Given("User on Login Page")
	public void user_on_login_page() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

//	@When("User enter correct username But incorrect password")
//	public void user_enters_correct_username_but_incorrect_password() {
//	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
//	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("somepass");
//	}
//
//	@When("User clicks Login button")
//	public void user_clicks_on_login_button() {
//	    driver.findElement(By.xpath("//button[@id='submit']")).click();
//	}

//	@Then("User receives error message")
//	public void user_receives_error_message() {
//	    boolean error_status = driver.findElement(By.xpath("//div[@id='error']")).isDisplayed();
//	    assertFalse(error_status);
//	}
	


	@When("user enters correct username But incorrect password")
	public void user_enters_correct_username_but_incorrect_password() {
	       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("somepass");
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//button[@id='submit']")).click();
	    
	}


	@Then("User receives error message")
	public void user_receives_error_message() {
	    boolean error_status = driver.findElement(By.xpath("//div[@id='error']")).isDisplayed();System.out.println(error_status);
	    assertFalse(error_status);
	   // System.out.println(error_status);
	}
}