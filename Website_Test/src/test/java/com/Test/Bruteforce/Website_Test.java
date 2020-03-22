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
import org.openqa.selenium.support.ui.WebDriverWait;

public class Website_Test {
	WebDriver driver =null;
  @Test()
  public void checkValidAccount() {
	 try {
		WebDriver driver =  BrowserFactory.startBrowser("firefox","http://ebfs.bruteforcesolution.net/ebfs/index.php");
		 HomePage signbutton = PageFactory.initElements(driver,HomePage.class); 
		 signbutton.clickSignInLink();
		 LogInPage already_register_Acc = PageFactory.initElements(driver,LogInPage.class);
		 already_register_Acc.createAccount("rabbani@rabbani.com"); 
		 driver.close();
	} catch (Exception e) {
		System.out.println("This is Test case 2");
		e.printStackTrace();
	}
  }
  @Test()
  public void checkInvalidEmail() {
	  try {
		WebDriver driver = BrowserFactory.startBrowser("chrome","http://ebfs.bruteforcesolution.net/ebfs/index.php");
		  HomePage signButton = PageFactory.initElements(driver,HomePage.class);
		  signButton.clickSignInLink();
		  InvalidEmail_Address checkValiditiy = PageFactory.initElements(driver,InvalidEmail_Address.class);
		  checkValiditiy.entervalidEmail("abc.com");
		  driver.close();
	} catch (Exception e) {
		System.out.println("This is test case 1.Create_Account_Page");
		e.printStackTrace();
	}
  }
  @Test
  public void customerAccCreatePage() {
	  try {
		WebDriver driver = BrowserFactory.startBrowser("firefox","http://ebfs.bruteforcesolution.net/ebfs/index.php");
		  HomePage loginButton = PageFactory.initElements(driver, HomePage.class);
		  loginButton.clickSignInLink();
		  LogInPage createAcc = PageFactory.initElements(driver,LogInPage.class);
		  createAcc.createAccount("hossainmd754@outlook.com");
		  Create_Account_Page accPage = PageFactory.initElements(driver,Create_Account_Page.class);
		  accPage.createCustomerAcc("farhana","parvin","abc2019", "12", "June","1999");
		  //accPage.createCustomerAcc("khan", "helal", "absc1019","10", "April", "1980");
		  WebDriverWait bfsWait = new WebDriverWait(driver, 20);
	} catch (Exception e) {
		System.out.println("This is test case 3.");
		e.printStackTrace();
	}
  }
  @BeforeClass
  public void openbrowser() {
	  
  }
  
  @AfterClass
  public void afterClass() {
	 
	  
  }

 
}
