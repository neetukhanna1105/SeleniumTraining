package ch03_auto.page.element;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class EX04IdentifyingLinks extends BaseTest1 {

	/*
	 * Identify Lost your password link by full link text
	 */

	@Test
	void test01() {
		WebElement element = getDriver().findElement(By.linkText("Lost your password?"));
		SeleniumUtils.printElementInfo("Lost your password?", element);
	}
	
	/*
	 * Identify Back to <blog> by partial link text
	 * Contains <- and name of the blog may change
	 * 
	 */

	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.partialLinkText("Back to"));
		SeleniumUtils.printElementInfo("Back to blog link", element);
	}

}