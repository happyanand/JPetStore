package Jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage 
{
	WebDriver driver;
	
	By Register=By.xpath("//a[text()='Register Now!']");
	By User_Name = By.xpath("//input[@name='username']");
	By Password = By.xpath("//input[@type='password']");
	By Login = By.xpath("//input[@name='signon']");

	public SignInPage(WebDriver d) 
	{
		driver=d;
	}
	
	public void Register() 
	{ 
		driver.findElement(Register).click(); 
	}
	
	public void Username()
	{
		driver.findElement(User_Name).sendKeys("j2ee");
	}
	public void Password()
	{
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys("j2ee");
	}
	public void Login()
	{
		driver.findElement(Login).click();
	}
}
