package ch04_auto.beyond;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import common.BaseTest2;

class EX06_UploadFile extends BaseTest2{

	@Test
	void uploadFile() {
		this.getDriver().findElement(By.linkText("Media")).click();
		this.getDriver().findElement(By.linkText("Add New")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement browseButton = getDriver().findElement(By.id("async-upload"));
		String expectedFileName = "file-upload.jpg";
		String path = System.getProperty("user.dir")
				+ File.separator
				+ "files"
				+ File.separator + expectedFileName;
		
		browseButton.sendKeys(path);
		
		getDriver().findElement(By.id("html-upload")).click();
		
		getWaiter().until(ExpectedConditions.visibilityOfElementLocated(By.className("thumbnail")));
		
		//You can take further actions to verify correct file upload - Skipping for this exercise. 
	}

}