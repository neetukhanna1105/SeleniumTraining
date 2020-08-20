package ch3_1_auto.page;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import common.Configuration;

class EX05_JUnitVerifyTitle {

	@Test
	void testSiteTitle() {
		WebDriver driver = Configuration.createFireFoxDriver();
		driver.get("https://www.google.com");
		String expectedTitle = "Dummy";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
		driver.quit();		
	}

}
