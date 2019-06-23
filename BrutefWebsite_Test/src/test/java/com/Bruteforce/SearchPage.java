package com.Bruteforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchPage extends WebsiteOpen {
WebDriver driver;
 public void searchProduct() {
	 try {
		 driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Shirt");
		 driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 WebElement element = driver.findElement(By.linkText("Top sellers"));
		 String name = element.getText();
		 if (name.contains("Top Sellers")) {
			 String cloth = driver.findElement(By.xpath("//a[contains(text(),'Polo Shirt')]")).getText();
			 Assert.assertTrue(cloth.contains("Polo Shirt"));
			 
		 }
		  
	 }
	 catch (Exception e) {
		 System.out.println("this is search page class.");
	 }
 }
}
