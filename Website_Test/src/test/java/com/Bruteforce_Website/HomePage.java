package com.Bruteforce_Website;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver = null;
	 @FindBy(xpath="//a[@class='login']")
	 @CacheLookup
	 WebElement SignInLink;
	 
	public HomePage( WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);	
	}
	
	public void clickSignInLink() {
		SignInLink.sendKeys(Keys.RETURN);
	}

}
