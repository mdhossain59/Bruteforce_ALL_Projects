package Webdriver.test.Webdriver.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("what is cucumber in selenoum");
	  driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","/Users/mdhossain/Selenium/geckodriver");
	  driver = new FirefoxDriver();
	  driver.get("https://www.youtube.com/");
	  
	  /*System.setProperty("webdriver.chrome.driver","Users/mdhossain/Selenium/chromedriver");
	  driver = new ChromeDriver();
	  driver.get("https://www2.cuny.edu/");
	  */
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
