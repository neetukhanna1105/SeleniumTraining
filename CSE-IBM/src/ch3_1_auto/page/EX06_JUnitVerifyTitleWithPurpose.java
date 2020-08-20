package ch3_1_auto.page;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import common.Configuration;

class EX06_JUnitVerifyTitleWithPurpose {

	@Test
	void testSiteTitle() {
		WebDriver driver = Configuration.createFireFoxDriver();
		driver.get("https://www.google.com");
		String expectedTitle = "Dummy";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle, "Verify Site Title");
		driver.quit();		
	}

}
