package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {
  public static void main (String [] args) {
	  
	 String path1 = "D:\\Testing Course\\automation testing\\javaworkspace\\SeleniumTraining\\Executables\\chromedriver.exe";
	 String path2 = ".\\Executables\\chromedriver.exe";
	  
	 System.setProperty("webdriver.chrome.driver",path2 );
	 
	
	ChromeDriver XYZ = new ChromeDriver();
	 
	 
}
}