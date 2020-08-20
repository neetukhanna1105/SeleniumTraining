package ch3_1_auto.page;

import org.openqa.selenium.WebDriver;

import common.Configuration;

public class EX01_PageMetaData {

	public static void main(String[] args) throws Exception {
		WebDriver driver = Configuration.createFireFoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		System.out.println("Current URL"+ driver.getCurrentUrl());
		System.out.println("Page title"+ driver.getTitle());
		driver.quit();
	}

}
