package ch3_1_auto.page;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import common.Configuration;

class EX07_JUnitTestFixtures {
	WebDriver driver=null;

	@BeforeEach
	void launchBrowser() throws Exception {
		driver = Configuration.createFireFoxDriver();
	}

	@AfterEach
	void closeBroser() throws Exception {
		driver.quit();
	}

	@Test
	void test() {
		driver.get("https://www.google.com");
		String expectedTitle = "Dummy";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle, "Verify Site Title");
	}

}
