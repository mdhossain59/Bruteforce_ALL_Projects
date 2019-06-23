package com.Bruteforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogInPage extends WebsiteOpen {
	public void login() {
	try {
		driver.findElement(By.xpath("//img[@class='logo img-responsive']")).isDisplayed();
		 driver.findElement(By.xpath("//a[@class='login']")).click();
		 driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("email@email.com");
		 WebElement webelement = driver.findElement(By.xpath("//form[@id='create-account_form']"));
		  webelement.click(); 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	catch (Exception e) {
		System.out.println("This is log in page test.");
			
		}
		
	}
	
		
	
}
