package com.UtilityPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

// this is the browser page where we can choose our browser.
public class BrowserFactory {
	static WebDriver driver= null;
	
	public static WebDriver startBrowser(String browserName, String url) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("ProjectPath: "+projectPath);
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectPath+"/driver/chromedriver/chromedriver");
			driver = new ChromeDriver();
			
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",projectPath+"/driver/geckodriver/geckodriver");
			driver = new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.ie.driver","");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		
		return driver;
	}

}
