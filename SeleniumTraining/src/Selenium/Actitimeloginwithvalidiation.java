package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimeloginwithvalidiation {
	public static void main (String[] args) {
		String Path =".\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameinputfield=driver.findElement(By.id("username"));
		System.out.println("User nameinput filed display"+usernameinputfield.isDisplayed());
		System.out.println("User name input field enables"+usernameinputfield.isEnabled());
		usernameinputfield.sendKeys("admin");
		
		WebElement Passwordinputfield=driver.findElement(By.name("pwd"));
		System.out.println("Password i/p field display"+Passwordinputfield.isDisplayed());
		System.out.println("Password i/p field enables"+Passwordinputfield.isEnabled());
		
		
		
		
	}

}
