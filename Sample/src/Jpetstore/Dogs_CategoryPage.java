package Jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dogs_CategoryPage 
{
	WebDriver driver;
	
	By Bulldog = By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a");
	By Poodle = By.xpath("//*[@id='Catalog']/table/tbody/tr[3]/td[1]/a");
	By Dalmation = By.xpath("//*[@id='Catalog']/table/tbody/tr[4]/td[1]/a");
	By Golden_Retriever = By.xpath("//*[@id='Catalog']/table/tbody/tr[5]/td[1]/a");
	By Labrador_Retriever = By.xpath("//*[@id='Catalog']/table/tbody/tr[6]/td[1]/a");
	By Chihuahua = By.xpath("//*[@id='Catalog']/table/tbody/tr[7]/td[1]/a");
	By Return_to_Main_Menu = By.xpath("//a[text()='Return to Main Menu']");	
	
		
	public Dogs_CategoryPage(WebDriver d) 
	{
		driver=d;
	}
	
	public void Bulldog()
	{
		driver.findElement(Bulldog).click();
	}
	
	public void Poodle()
	{
		driver.findElement(Poodle).click();
	}
	
	public void Dalmation()
	{
		driver.findElement(Dalmation).click();
	}
	
	public void Golden_Retriever()
	{
		driver.findElement(Golden_Retriever).click();
	}
	
	public void Labrador_Retriever()
	{
		driver.findElement(Labrador_Retriever).click();
	}
	
	public void Chihuahua()
	{
		driver.findElement(Chihuahua).click();
	}
	
	public void Return_to_Main_Menu()
	{
		driver.findElement(Return_to_Main_Menu).click();
	}
}
