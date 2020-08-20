package ch03_1_auto.elementaction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Configuration;

class EX01_EnterAndVerifyText extends BaseTest1 {

	@Test
	void enterUserName() {
		
		String expectedUserName = Configuration.USER_NAME;
		WebElement userTextBox = getDriver().findElement(By.name("log"));
		assertTrue(userTextBox.isEnabled(),"Assert that user name text box is enabled");
		userTextBox.sendKeys(expectedUserName);
		
		String actualUserName = userTextBox.getAttribute("value");
		assertEquals(expectedUserName, actualUserName,"Assert that user name is entered correctly");
		
	}

}
