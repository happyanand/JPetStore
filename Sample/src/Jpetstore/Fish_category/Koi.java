package Jpetstore.Fish_category;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Koi 
{
	WebDriver driver;
	
	By Spotted_Koi = By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a");
	By Spotless_Koi = By.xpath("//*[@id='Catalog']/table/tbody/tr[3]/td[1]/a");
	By Return_to_FISH = By.xpath("//a[text()='Return to FISH']");
	By Add_to_Cart1 = By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[5]/a");
	By Add_to_Cart2 = By.xpath("//*[@id='Catalog']/table/tbody/tr[3]/td[5]/a");
	
	public Koi(WebDriver d) 
	{
		driver=d;
	}
	
	public void Spotted_Koi()
	{
		driver.findElement(Spotted_Koi).click();
	}
	
	public void Spotless_Koi()
	{
		driver.findElement(Spotless_Koi).click();
	}
	
	public void Return_to_FISH()
	{
		driver.findElement(Return_to_FISH).click();
	}
	
	public void Add_to_Cart1()
	{
		driver.findElement(Add_to_Cart1).click();
	}
	
	public void Add_to_Cart2()
	{
		driver.findElement(Add_to_Cart2).click();
	}
	
}