package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

 public static void main (String[]args) {
 
 String Path = ".\\Executables\\geckodriver.exe";
 System.setProperty("webdriver.gecko.driver", Path);
 WebDriver driver = new FirefoxDriver();
 driver.get("https://www.facebook.com/");
 
 }
 
 }
 
 
