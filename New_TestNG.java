package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class New_TestNG {
	WebDriver driver;
	@Test 
	public void case1() {
		boolean firstT = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).isDisplayed();
		if(firstT== true) {
			System.out.println("the test case passed");
		}
		else {
			System.out.println("test case failed.");
		}
		
	}
	@Test
	public void case2() {
		boolean secondT = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]")).isDisplayed();
		if(secondT == true) {
			System.out.println("The test case passed");
		}
		else {
			System.out.println("The test case is failed.");
		}
		
	}
	@Test
	public void case3() {
		driver.findElement(By.xpath("//a[@class = 'login']")).click();
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("hossainmd754@outlook.com");
		driver.findElement(By.xpath("//*[@id=\"create-account_form\"]")).click();
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Abu");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Hanif");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("Selenium19");
		driver.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("19");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[2]/div/select/option[3]")).sendKeys("April");
		driver.findElement(By.xpath("//*[@id=\"years\"]")).sendKeys("2001");
		driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/button/span")).click();
	}
		
		
	@BeforeMethod
	public void open_Browser() {
		System.setProperty("webdriver.gecko.driver","/Users/mdhossain/Selenium/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
		
	}
	@AfterMethod
	public void close_Browser() {
		driver.quit();
		
	}

}
