package com.TestRunner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
//import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Pallavi\\eclipse-workspace\\com.cucumber.Login.TestDemo\\Features",
glue= {"com.stepDefinition"})

//"com.cucumber.listener.ExtentCucumberFormatter:test-out/report.html"}monochrome = true) extends AbstractTestNGCucumberTests
public class Runner{

 	}
