package com.Bruteforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class QuickViewPage extends WebsiteOpen {
	WebDriver driver;
	public void mouseHover(){
		try {
			WebElement element = driver.findElement(By.xpath("//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//span[contains(text(),'Add to cart')]"));
			  
			  Actions builder = new Actions(driver);
			  builder.moveToElement(element).perform();
			  driver.findElement(By.xpath("//th[@class='cart_quantity item']")).isDisplayed();
			  driver.findElement(By.xpath("//a[@id='cart_quantity_up_1_1_0_0']//span"));
			  driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")).click();
			 
			
		}
		catch (Exception e) {
			System.out.println("this is quick view page.");
		}
	}

}
