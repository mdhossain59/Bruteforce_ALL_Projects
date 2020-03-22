package com.Test.Bruteforce;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentTestReport {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
	 htmlReporter = new ExtentHtmlReporter("extent.html");
    
    // create ExtentReports and attach reporter(s)
     extent = new ExtentReports();
    extent.attachReporter(htmlReporter);
	}
	
    @BeforeTest
    public void setUp2() {
    	String projectPath = System.getProperty("user.dir");
    	System.setProperty("webdriver.gecko.driver",projectPath+"/driver/geckodriver/geckodriver");
    	
    	
    
    
	}
	@Test
	public void test1() throws IOException {
		// creates a toggle for the given test, adds all log events under it    
        test = extent.createTest("MyFirstTest", "Sample description");
        driver.get("https://www.youtube.com/");
        test.pass("Navigate to youtube.");
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
		
	}
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test is completted successfully.");
	}
	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
	

}
