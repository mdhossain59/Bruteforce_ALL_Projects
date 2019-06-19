package com.BruteForce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase2 (){
	WebDriver driver;
	@BeforeClass
	Public void beforeTest() {
		System.setProperty("webdriver.gecko.driver","/Users/mdhossain/Selenium/geckodriver");
		  driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
		  driver.manage().window().maximize();
		
	}
  @Test
  Public void Testcase1() {
	  
  }
  @Test
  Public void Testcase2() {
	  
  }
  @Test
  Public void Testcase3() {
	  
  }
  @Test
  Public void Testcase4() {
	  
  }
  @Test
  Public void Testcase5() {
	  
  }
  @AfterClass
  Public void afterTest() {
	
	  
	  
  }
}
