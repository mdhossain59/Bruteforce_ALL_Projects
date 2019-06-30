package com.youTube;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_YouTube {
	
public static void main(String[] args) {
	System.out.println("Welcome to Automation Testing");
	System.out.println("This is a website opening project.");
	System.out.println("Please browser type you like to use.");
	Scanner scan = new Scanner(System.in);
	String browserType = null;
	browserType = scan.nextLine();
	System.out.println("your browser type is: "+browserType);
	  WebDriver driver;
	if (browserType.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","/Users/mdhossain/eclipse-workspace/youTube_Test/drivers/geckodriver/geckodriver");
		 driver = new FirefoxDriver();
	}
	else {
		System.setProperty("webdriver.chrome.driver","/Users/mdhossain/eclipse-workspace/youTube_Test/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();
	}
	driver.get("https://www.youtube.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("search")).sendKeys("Amar Jonom gelo vule vule full songs|farhan|Evana|R-F");
	driver.findElement(By.id("search-icon-legacy")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Amar Jonom Gelo Vule vule | আমার জনম গেলো ভুলে ভুল')]")).click();
	//driver.findElement(By.className("style-scope yt-img-shadow")).click();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
	
	
}
}
