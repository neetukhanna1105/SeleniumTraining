package ch03_auto.page.element;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class EX02_PrintElementInfo extends BaseTest1{

	/*
	 * Identify UserName by Name
	 */
	@Test
	void test() {
		WebElement element = getDriver().findElement(By.name("log"));		
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

}
