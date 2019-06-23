package com.Bruteforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends WebsiteOpen {
WebDriver driver;
public void signInAccount() {
	try {
		driver.findElement(By.xpath("//a[@class='login']")).click();
		  driver.findElement(By.xpath("//h3[contains(text(),'Create an account')]")).isDisplayed();
		  driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("rabbani@rabbani.com");
		  WebElement webelement = driver.findElement(By.xpath("//form[@id='create-account_form']"));
		  webelement.click(); 
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	catch (Exception e) {
		System.out.println("this is the sign in page class.");
		
	}
}
}
