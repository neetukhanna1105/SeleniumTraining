package ch3_1_auto.browsers;
import org.openqa.selenium.WebDriver;

import common.Configuration;

public class EX02_05BrowserMethods {
	
		public static void main(String[] args) throws Exception {
			WebDriver driver = Configuration.createFireFoxDriver();
			driver.manage().window().maximize();
			
			//driver.get(Configuration.BLOG_URL);	
			driver.get("https://www.google.com");	
			Thread.sleep(3000); //this is a bad way to wait - We will learn better ways later	
			
			driver.navigate().back();
			Thread.sleep(3000); //this is a bad way to wait - We will learn better ways later
			
			driver.navigate().forward();
			Thread.sleep(3000); //this is a bad way to wait - We will learn better ways later	
			
			driver.navigate().refresh();
			Thread.sleep(3000); //this is a bad way to wait - We will learn better ways later
			
			System.out.println("Window Handle: " + driver.getWindowHandle());			
			for (String win : driver.getWindowHandles()) {
				System.out.println("Handle: " + win);			
			}
			driver.quit();			
		}
}