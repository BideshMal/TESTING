package com.coforge.testing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class UnitTest {
	int i,j;
	
  @Test
  public void testsomeFunctionality() {
	  System.out.println("Testing");
	  assertEquals(i==j, false);//(actual,expected)
  }
  @BeforeMethod
  public void setup() {
	  System.out.println("Setting up");
	  i=10;j=20;
  }

  @AfterMethod
  public void teardown() {
	  System.out.println("Freeing the resources");
  }

}
