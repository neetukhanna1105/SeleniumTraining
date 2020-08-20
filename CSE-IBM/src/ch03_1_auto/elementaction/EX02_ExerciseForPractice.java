package ch03_1_auto.elementaction;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Configuration;

class EX02_ExerciseForPractice extends BaseTest1{

	@Test
	void test() throws Exception {
		WebElement userTextBox = getDriver().findElement(By.name("log"));
		userTextBox.sendKeys(Configuration.USER_NAME);
		
		WebElement pwdTextBox = getDriver().findElement(By.name("pwd"));
		pwdTextBox.sendKeys(Configuration.PASSWORD);
		pwdTextBox.submit();
		
		Thread.sleep(2000);
		
		boolean dBoardLoaded = getDriver().findElement(By.id("wpadminbar")).isDisplayed();
		assertTrue(dBoardLoaded, "Assert that dashboard is displayed");
		
		WebElement logOut = getDriver().findElement(By.xpath("//*[text()='Log Out']"));
		getDriver().get(logOut.getAttribute("href"));
		
		Thread.sleep(2000);
		
		WebElement logOutMsg = getDriver().findElement(By.xpath("//*[contains(text(),'logged out')]"));
		assertTrue(logOutMsg.isDisplayed(),"Assert successfull logout");
				
	
	}


}
