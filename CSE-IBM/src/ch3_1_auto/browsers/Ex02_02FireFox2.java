package ch3_1_auto.browsers;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ex02_02FireFox2 {

 public static void main(String[] args) throws Exception {
  String driverPath = System.getProperty("user.dir")
    + File.separator
    + "drivers"
    + File.separator
    + "geckodriver.exe"; //add exe for windows
 
  System.setProperty("webdriver.gecko.driver", driverPath);
  
  WebDriver driver = new FirefoxDriver();
  
   //there is better way. 
  
  Thread.sleep(5000); //this is a very bad way of waiting - we will learn better ways later
  driver.quit();

 }

}
