package Jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Reptiles_CategoryPage 
{
WebDriver driver;
	
	By Rattlesnake = By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a");
	By Iguana = By.xpath("//*[@id='Catalog']/table/tbody/tr[3]/td[1]/a");
	By Return_to_Main_Menu = By.xpath("//a[text()='Return to Main Menu']");	
	
		
	public Reptiles_CategoryPage(WebDriver d) 
	{
		driver=d;
	}
	
	public void Rattlesnake()
	{
		driver.findElement(Rattlesnake).click();
	}
	
	public void Iguana()
	{
		driver.findElement(Iguana).click();
	}
	
	public void Return_to_Main_Menu()
	{
		driver.findElement(Return_to_Main_Menu).click();
	}
}
