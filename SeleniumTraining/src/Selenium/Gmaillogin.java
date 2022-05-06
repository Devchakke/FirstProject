package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillogin {
	
	public static void main(String[] args ) {
		String path = ".\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	String Exceptedtitle="Gmail";
	String actualTitle=driver.getTitle();
	if(actualTitle.equals(Exceptedtitle));{
		System.out.println("Login page display");
	}
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("devchakkeakshay@gmail.com");
		driver.findElement(By.cssSelector("div.dG5hZc>div>div>div>button")).click();
		
		//driver.findElement(arg0)
	}
	
			
		
		}
			
	
	
	
	
	


