package com.Bruteforce_Website;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	WebDriver driver= null;
	
	@FindBy(xpath="//input[@id='email_create']")
	@CacheLookup
	WebElement EmailAddress;
	
	@FindBy(xpath="*//button[@id='SubmitCreate']")
	@CacheLookup
	WebElement SubmitButton;
	
	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void createAccount(String email) {
		EmailAddress.sendKeys(email);
		SubmitButton.sendKeys(Keys.RETURN);
	}
}
