package com.Bruteforce;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebsiteOpen {
	WebDriver driver;
	public void OpenBrowser() {
		System.out.println("Welcome to Automation Testing");
		  String browser;
		  Scanner scan = new Scanner (System.in);
		  System.out.println(" Please enter a browser you like to use. ");
		  browser =scan.nextLine();
		  String projectPath = System.getProperty("user.dir");
		  System.out.println(" Project Path: "+projectPath);
		  
		  if (browser.equalsIgnoreCase("firefox")) {
		  
		  System.setProperty("webdriver.gecko.driver",projectPath+"/drivers/geckodriver/geckodriver");
		  driver = new FirefoxDriver();
		  }
		  else {
		  System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver");
		  driver =new ChromeDriver();
		  }
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
		  driver.manage().window().maximize();
		
	}
	
	

}
