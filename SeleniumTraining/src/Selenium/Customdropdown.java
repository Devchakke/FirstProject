package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Customdropdown {
	public static void main(String[]args) {
		
		String path=".\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		WebDriverWait wait= new WebDriverWait(driver,30);
		WebElement dropdown=driver.findElement(By.id("bsd1-search"));
		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		dropdown.click();
		List<WebElement> options=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
		System.out.println("Options"+options.size());
		for(int i=0;i<options.size();i++);
		{
			
		}
	}
		
	
		
		
		
	
	


