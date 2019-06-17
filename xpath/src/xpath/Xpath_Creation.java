package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_Creation {

	public static void main(String[] args) {
	try {
		
		System.setProperty("webdriver.gecko.driver", "/Users/mdhossain/Selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
		String title = driver.getTitle();
		System.out.println(" Page title "+title);
		driver.findElement(By.xpath("//a[@class ='login']")).click();
		//driver.findElement(By.xpath("//a[@title=' Log in to your customer account']")).click();
		driver.findElement(By.xpath("//input[@id ='email_create']")).click();
		//driver.findElement(By.xpath("//input[@class='is required validate account_input form-control']")).click();
		driver.findElement(By.xpath("//input[@id ='email_create']")).sendKeys("rabbani@gmail.com");
		driver.findElement(By.xpath("//button[@id ='SubmitCreate']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("salam");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("barkat");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rabbani@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("selenium");
		Select days = new Select(driver.findElement(By.xpath("//select[@id='days']")));
		days.selectByValue("10");
		//days.selectByIndex(10);
		Select month = new Select(driver.findElement(By.xpath("//select[@id='months']")));
		month.deselectByValue("April");
		Select years = new Select(driver.findElement(By.xpath("//select[@id='years']")));
		years.selectByValue("1990");
		//years.selectByIndex(10);
		//driver.findElement(By.xpath("//input[@id='newsletter']")).isSelected();
		//driver.findElement(By.xpath("//input[@id='optin']")).isSelected();
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.quit();
		
	}
	catch (Exception e) {
		System.out.println("This is test for website login.");
	}
	finally {
	System.out.println(" You should work on the project.");	
	}
		
	
		

	}

}
