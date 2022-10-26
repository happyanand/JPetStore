package Jpetstore.Fish_category;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Goldfish 
{
	WebDriver driver;
	
	By Adult_Male_Goldfish = By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a");
	By Adult_Female_Goldfish = By.xpath("//*[@id='Catalog']/table/tbody/tr[3]/td[1]/a");
	By Return_to_FISH = By.xpath("//a[text()='Return to FISH']");
	By Add_to_Cart1 = By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[5]/a");
	By Add_to_Cart2 = By.xpath("//*[@id='Catalog']/table/tbody/tr[3]/td[5]/a");
	
	public Goldfish(WebDriver d) 
	{
		driver=d;
	}
	
	public void Adult_Male_Goldfish()
	{
		driver.findElement(Adult_Male_Goldfish).click();
	}
	
	public void Adult_Female_Goldfish()
	{
		driver.findElement(Adult_Female_Goldfish).click();
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
