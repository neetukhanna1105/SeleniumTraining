package ch3_1_auto.browsers;

import org.openqa.selenium.WebDriver;
import common.Configuration;

public class Ex02_03Chrome {

 public static void main(String[] args) throws Exception {
 
  WebDriver driver = Configuration.createChromeDriver();
  
   //there is better way. 
  
  Thread.sleep(5000); //this is a very bad way of waiting - we will learn better ways later
  driver.quit();

 }

}
