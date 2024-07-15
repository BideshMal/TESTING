package com.coforge.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features={"MyAppFeatures/Login.feature"},
		glue = {"com.coforge.steps"}
		)
public class TestRunner {

}
