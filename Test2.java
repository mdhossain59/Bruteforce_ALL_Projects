package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Test2 {
	WebDriver driver;
  @Test
  public void search() {
	  
  }
  @Test
  public void login() {
	  System.out.println(" open a browser.");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	System.setProperty("webdriver.gecko.driver","/Users/mdhossain/Selenium/geckodriver");
    driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
	
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
