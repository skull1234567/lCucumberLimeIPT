package com.Lime.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\navee\\eclipse-workspace\\LimeIPT\\src\\test\\java\\com\\Lime\\features\\Lime.feature",
		glue = "com.stepdefinition",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
				"html:Reports/lime.html",
				"json:Reports/lime.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
		)
public class Testrunner {

}
