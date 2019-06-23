package com.Bruteforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount extends WebsiteOpen {
	WebDriver driver;
	public void createCustomerAccount() {
		try {
			driver.findElement(By.xpath("//a[@class='login']")).click();
			  driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("hossainmd754@outlook.com");
			  WebElement webelement = driver.findElement(By.xpath("//form[@id='create-account_form']"));
			  webelement.click();
			  driver.findElement(By.name("id_gender")).click();
			  driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("abdur");
			  driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Rahim");
			  driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("selenium01");
			  driver.findElement(By.xpath("//select[@id='days']")).sendKeys("10");
			  driver.findElement(By.xpath("//select[@id='months']")).sendKeys("April");
			  driver.findElement(By.xpath("//select[@id='years']")).sendKeys("1990");
			  driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
			
		}
		catch (Exception e) {
			System.out.println("this is create account page");
		}

	}
}

