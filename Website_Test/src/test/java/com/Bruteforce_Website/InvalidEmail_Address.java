package com.Bruteforce_Website;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvalidEmail_Address {
	WebDriver driver = null;
	@FindBy(xpath="//input[@id='email_create']")
	WebElement emailAddress;
	
	@FindBy(name="SubmitCreate")
	WebElement clickSubmitButton;
	
	public InvalidEmail_Address(WebDriver driver) {
		this.driver = driver;
		
	}
	public void entervalidEmail(String validEmail) {
		emailAddress.sendKeys(validEmail);
		clickSubmitButton.sendKeys(Keys.RETURN);
		
	}

}
