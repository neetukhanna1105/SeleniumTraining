package ch04_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest2;
import common.SeleniumUtils;

class EX05_NestElements extends BaseTest2{

	@Test
	void test() {
		this.getDriver().findElement(By.linkText("Posts")).click();
		this.getDriver().findElement(By.linkText("Categories")).click();
		
		
		WebElement table = getDriver().findElement(By.className("wp-list-table"));
		WebElement firstCheckBox = table.findElement(By.name("delete_tags[]"));
		SeleniumUtils.printElementInfo("Category checkbox", firstCheckBox);
		
		firstCheckBox.click();
		assertTrue(firstCheckBox.isSelected(), "Assert checkbox selection");
		
	}

}