package com.Test.Bruteforce;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Bruteforce_Website.Create_Account_Page;
import com.Bruteforce_Website.HomePage;
import com.Bruteforce_Website.InvalidEmail_Address;
import com.Bruteforce_Website.LogInPage;
import com.UtilityPage.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Website_Test {
	WebDriver driver =null;
  @Test
  public void checkValidAccount() {
	 WebDriver driver =  BrowserFactory.startBrowser("firefox","http://ebfs.bruteforcesolution.net/ebfs/index.php");
	 HomePage signbutton = PageFactory.initElements(driver,HomePage.class); 
	 signbutton.clickSignInLink();
	 LogInPage already_register_Acc = PageFactory.initElements(driver,LogInPage.class);
	 already_register_Acc.createAccount("rabbani@rabbani.com"); 
	 driver.close();
  }
  @Test
  public void checkInvalidEmail() {
	  WebDriver driver = BrowserFactory.startBrowser("chrome","http://ebfs.bruteforcesolution.net/ebfs/index.php");
	  HomePage signButton = PageFactory.initElements(driver,HomePage.class);
	  signButton.clickSignInLink();
	  InvalidEmail_Address checkValiditiy = PageFactory.initElements(driver,InvalidEmail_Address.class);
	  checkValiditiy.entervalidEmail("abc.com");
	  driver.close();
  }
  @Test
  public void customerAccCreatePage() {
	  WebDriver driver = BrowserFactory.startBrowser("firefox","http://ebfs.bruteforcesolution.net/ebfs/index.php");
	  HomePage loginButton = PageFactory.initElements(driver, HomePage.class);
	  loginButton.clickSignInLink();
	  LogInPage createAcc = PageFactory.initElements(driver,LogInPage.class);
	  createAcc.createAccount("hossainmd754@outlook.com");
	  Create_Account_Page accPage = PageFactory.initElements(driver,Create_Account_Page.class);
	  accPage.createCustomerAcc("Md", "Hossain", "Automation123","10", "April", "1980");
  }
  @BeforeClass
  public void openbrowser() {
	  
  }
  
  @AfterClass
  public void afterClass() {
	 
	  
  }

 
}
