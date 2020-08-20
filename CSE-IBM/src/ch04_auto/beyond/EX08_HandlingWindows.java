package ch04_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

import common.BaseTest2;
import common.Configuration;

class EX08_HandlingWindows extends BaseTest2{

	@Test
	void createNewTab() {
		System.out.println(getDriver().getTitle());
		String mainWin = getDriver().getWindowHandle();

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.open(arguments[0]);", Configuration.BLOG_URL);

		for (String handle : getDriver().getWindowHandles()) {
			if (!handle.equals(mainWin)) {
				getDriver().switchTo().window(handle);
				System.out.println(getDriver().getTitle());
				getDriver().close();
			}

		}

		getDriver().switchTo().window(mainWin);
		System.out.println(getDriver().getTitle());

		assertEquals(getDriver().getWindowHandles().size(), 1, "Assert if the new window is closed");

	}

}
