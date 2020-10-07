package com.Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"C:\\Users\\Ravi\\eclipse-workspace\\AMAZON1\\src\\test\\resources\\Features"},
dryRun=false,strict=true,glue= {"com.stepDef"},plugin = {"json:C:\\Users\\Ravi\\eclipse-workspace\\AMAZON1\\Report\\pqr.json"})



public class runnerCls extends AbstractTestNGCucumberTests {
public static WebDriver d1;
	
	@DataProvider
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
 
	@BeforeClass
	@Parameters("browser")
	public void crsBro(String br)
	{
		if (br.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\eclipse-workspace\\Amazon\\Driver\\chromedriver.exe");
			d1=new ChromeDriver();	
			
		}
		else if (br.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ravi\\Downloads\\geckodriver-v0.27.0-win64 (1)\\geckodriver.exe");
			d1=new FirefoxDriver();
		}
	}

	
	
	
}
