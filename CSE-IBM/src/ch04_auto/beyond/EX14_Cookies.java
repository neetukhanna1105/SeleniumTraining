package ch04_auto.beyond;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import common.BaseTest2;

class EX14_Cookies extends BaseTest2{

	@Test
	void handleCookies() {
			
		//Get Cookies and print the cookie information
		
		for (org.openqa.selenium.Cookie cookie : getDriver().manage().getCookies()) {
			System.out.println("Cookie Information");
			System.out.println("Name: " + cookie.getName());
			System.out.println("Value " + cookie.getValue());
			System.out.println("Domain: " + cookie.getDomain());
			System.out.println("Path: " + cookie.getPath());
			System.out.println("Secure: " + cookie.isSecure());
			System.out.println("HttpOnly? " + cookie.isHttpOnly());
			System.out.println("Full text: " + cookie);
		}
		
		//delete all cookies
		getDriver().manage().deleteAllCookies();
		
		getDriver().navigate().refresh();
		getDriver().findElement(By.name("log"));
		
		//As we are on the home page, the @AfterEach would fail BaseTest2
		
	}

}