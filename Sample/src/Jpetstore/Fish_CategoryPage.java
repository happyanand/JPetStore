package Jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fish_CategoryPage 
{
	WebDriver driver;
	
	By Angelfish = By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a");
	By Tiger_Shark = By.xpath("//*[@id='Catalog']/table/tbody/tr[3]/td[1]/a");
	By Koi = By.xpath("//*[@id='Catalog']/table/tbody/tr[4]/td[1]/a");
	By Goldfish = By.xpath("//*[@id='Catalog']/table/tbody/tr[5]/td[1]/a");
	By Return_to_Main_Menu = By.xpath("//a[text()='Return to Main Menu']");

	
	
		
	public Fish_CategoryPage(WebDriver d) 
	{
		driver=d;
	}
	
	public void AngelFish()
	{
		driver.findElement(Angelfish).click();
	}
	
	public void Tiger_Shark()
	{
		driver.findElement(Tiger_Shark).click();
	}
	
	public void Koi()
	{
		driver.findElement(Koi).click();
	}
	
	public void Goldfish()
	{
		driver.findElement(Goldfish).click();
	}
	
	public void Return_to_Main_Menu()
	{
		driver.findElement(Return_to_Main_Menu).click();
	}
	
}
