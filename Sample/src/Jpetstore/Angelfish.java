package Jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Angelfish 
{
	WebDriver driver;
	
	By Large_Angelfish = By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a");
	By Small_Angelfish = By.xpath("//*[@id='Catalog']/table/tbody/tr[3]/td[1]/a");
	By Return_to_FISH = By.xpath("//a[text()='Return to FISH']");
	By Add_to_Cart1 = By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[5]/a");
	By Add_to_Cart2 = By.xpath("//*[@id='Catalog']/table/tbody/tr[3]/td[5]/a");
	
	public Angelfish(WebDriver d) 
	{
		driver=d;
	}
	
	public void Large_Angelfish()
	{
		driver.findElement(Large_Angelfish).click();
	}
	
	public void Small_Angelfish()
	{
		driver.findElement(Small_Angelfish).click();
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
