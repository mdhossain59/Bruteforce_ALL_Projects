package com.BruteForce;
import java.util.Scanner;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Test1 {
	WebDriver driver;
	
  @Test(priority=0)
  public void f() {
	  driver.findElement(By.xpath("//img[@class='logo img-responsive']")).isDisplayed();
	  driver.findElement(By.xpath("//a[@class='login']")).click();
	  driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("invalidEmail@email");
	  WebElement webelement = driver.findElement(By.xpath("//form[@id='create-account_form']"));
	  webelement.click(); 
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  @Test()
  public void testcase2() {
	  
	  driver.findElement(By.xpath("//a[@class='login']")).click();
	  driver.findElement(By.xpath("//h3[contains(text(),'Create an account')]")).isDisplayed();
	  driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("rabbani@rabbani.com");
	  WebElement webelement = driver.findElement(By.xpath("//form[@id='create-account_form']"));
	  webelement.click(); 
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
  }
  @Test()
  public void testcase3() {
	  try {
		  driver.findElement(By.xpath("//a[@class='login']")).click();
		  driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("hossainmd754@outlook.com");
		  WebElement webelement = driver.findElement(By.xpath("//form[@id='create-account_form']"));
		  webelement.click();
		  driver.findElement(By.name("id_gender")).click();
		  driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("abdur");
		  driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Rahim");
		  //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hossainmd754@gmail.com");
		  driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("selenium01");
		  driver.findElement(By.xpath("//select[@id='days']")).sendKeys("10");
		  driver.findElement(By.xpath("//select[@id='months']")).sendKeys("April");
		  driver.findElement(By.xpath("//select[@id='years']")).sendKeys("1990");
		  driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
	  }
	  catch (Exception e) {
		 System.out.println("the test case has some problem"); 
	  }
  }
  @Test
  public void testcase4() {
	  try {
		  driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Shirt");
		  driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'Polo Shirt')]")).isDisplayed();
		  driver.findElement(By.xpath("//a[contains(text(),'Jeffery Plaid Shirt')]")).isDisplayed();
		  driver.findElement(By.xpath("//div[@class='right-block']//a[@class='product-name']")).isDisplayed();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  }
	  catch (Exception e) {
		  System.out.println("this is test case 4.");
	  }
  }
  @Test
  public void testcase5() {
	  try {
		  
		  WebElement element = driver.findElement(By.xpath("//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//span[contains(text(),'Add to cart')]"));
		  
		  Actions builder = new Actions(driver);
		  builder.moveToElement(element).perform();
		  driver.findElement(By.xpath("//th[@class='cart_quantity item']")).isDisplayed();
		  driver.findElement(By.xpath("//a[@id='cart_quantity_up_1_1_0_0']//span"));
		  driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")).click();
		 
	  }
	  catch (Exception e) {
		 
		  
	  }
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Welcome to Automation Testing.");
	  String browser;
	  Scanner scan = new Scanner (System.in);
	  System.out.println(" Please enter a browser you like to use. ");
	  browser =scan.nextLine();
	  String projectPath = System.getProperty("user.dir");
	  System.out.println(" Project Path: "+projectPath);
	  
	  if (browser.equalsIgnoreCase("firefox")) {
	  
	  System.setProperty("webdriver.gecko.driver",projectPath+"/drivers/geckodriver/geckodriver");
	  driver = new FirefoxDriver();
	  }
	  else {
	  System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver");
	  driver =new ChromeDriver();
	  }
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
	  driver.manage().window().maximize();
	  
  }
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
