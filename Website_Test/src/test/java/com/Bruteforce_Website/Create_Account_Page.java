package com.Bruteforce_Website;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Create_Account_Page {
	WebDriver driver = null;
@FindBy(xpath="//input[@id='id_gender1']")
WebElement chooseGender;

@FindBy(xpath="//input[@id='customer_firstname']")
WebElement firstName;

@FindBy(xpath="//input[@id='customer_lastname']")
WebElement lastName;

@FindBy(xpath="//input[@id='passwd']")
WebElement password;

@FindBy(xpath="//select[@id='days']")
WebElement days;
@FindBy(xpath="//select[@id= 'months']")
WebElement months;
@FindBy(xpath="//select[@id= 'years']")
WebElement years;
@FindBy(xpath="//button[@id='submitAccount']")
WebElement clikSubmitButton;
 
public Create_Account_Page (WebDriver driver) {
	this.driver = driver;
}
public void createCustomerAcc(String fname,String LName,String pass,String day, String month,String year ) {
	chooseGender.sendKeys(Keys.RETURN);
	firstName.sendKeys(fname);
	lastName.sendKeys(LName);
	password.sendKeys(pass);
	days.sendKeys(day);
	months.sendKeys(month);
	years.sendKeys(year);
	clikSubmitButton.sendKeys(Keys.RETURN);
	
	
}
}
