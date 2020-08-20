package ch04_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest2;
import common.SeleniumUtils;

class EX04_MultiMatch extends BaseTest2 {

	@Test
	void selectAllCategories() {
		this.getDriver().findElement(By.linkText("Posts")).click();
		this.getDriver().findElement(By.linkText("Categories")).click();

		List<WebElement> delCheckBoxes = getDriver().findElements(By.name("delete_tags[]"));

		System.out.println("Checkbox count: " + delCheckBoxes.size());

		for (WebElement element : delCheckBoxes) {
			SeleniumUtils.printElementInfo("Category checkbox", element);
			element.click();
			assertTrue(element.isSelected(), "Assert checkbox selection");
		}

	}
}

