package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		
		WebDriver acti = new ChromeDriver();
		
		acti.get("https://demo.actitime.com/");
		
		String title = acti.getTitle();
		System.out.println("Title of the Page :"+title);
		System.out.println("Length of the title :"+title.length());
		
	}
}
