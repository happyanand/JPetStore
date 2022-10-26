package Jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shopping_Cart_Page 
{
	WebDriver driver;
	
	By Update_Cart = By.xpath("//input[@type='submit']");
	By Remove = By.xpath("//a[text()='Remove']");
	By Quantity = By.xpath("//input[@type='text']");
	By Proceed_to_Checkout = By.xpath("//a[text()='Proceed to Checkout']");
	By Return_to_Main_Menu = By.xpath("//a[text()='Return to Main Menu']");
	
	public Shopping_Cart_Page(WebDriver d) 
	{
		driver=d;
	}
	
	public void Update_Cart()
	{
		driver.findElement(Update_Cart).click();
	}
	
	public void Remove()
	{
		driver.findElement(Remove).click();
	}
	
	public void Quantity()
	{
		driver.findElement(Quantity).click();
	}
	public void Proceed_to_Checkout()
	{
		driver.findElement(Proceed_to_Checkout).click();
	}
	
	public void Return_to_Main_Menu()
	{
		driver.findElement(Return_to_Main_Menu).click();
	}
		
}
