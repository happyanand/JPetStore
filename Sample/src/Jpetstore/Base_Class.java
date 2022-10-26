package Jpetstore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base_Class 
{
	public static WebDriver driver;
	
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://petstore.octoperf.com/");
	}
}