package com.WebsiteTest;

import org.testng.annotations.Test;

import com.Bruteforce.CreateAccount;
import com.Bruteforce.LogInPage;
import com.Bruteforce.QuickViewPage;
import com.Bruteforce.SearchPage;
import com.Bruteforce.SignInPage;
import com.Bruteforce.WebsiteOpen;

public class WebsiteTest {
 @Test
 public void logInPage() {
	 WebsiteOpen obj = new WebsiteOpen();
	 obj.OpenBrowser();
	 
	 LogInPage obj1 = new LogInPage();
	 obj1.OpenBrowser();
	 obj1.login();
	 
	 CreateAccount obj2 = new CreateAccount();
	 obj2.OpenBrowser();
	 obj2.createCustomerAccount();
	 
	 SignInPage obj3 = new SignInPage();
	 obj3.signInAccount();
	 obj3.OpenBrowser();
	 
	 SearchPage obj4 = new SearchPage();
	 obj4.searchProduct();
	 obj4.OpenBrowser();
	 
	 QuickViewPage obj5 = new QuickViewPage();
	 obj5.OpenBrowser();
	 obj5.mouseHover();
	 
	 
}
}
