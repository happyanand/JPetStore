package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Jpetstore.LinkPage;

class TC001
{	
	public static WebDriver driver;
	@Test
	void test1() 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petstore.octoperf.com/");
		LinkPage l = new LinkPage(driver);
		l.EnterStore();
		if(driver.getTitle().equals("JPetStore Demo")) 
		{
			System.out.println("Testcase1 Pass");	
		}
	}
	@AfterTest
	void close_window()
	{
		driver.close();
	}
}