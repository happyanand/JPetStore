package Jpetstore.Fish_category;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tiger_Shark 
{
	WebDriver driver;
	
	By Toothless_Tiger_Shark = By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a");
	By Return_to_FISH = By.xpath("//a[text()='Return to FISH']");
	By Add_to_Cart = By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[5]/a");
	
	public Tiger_Shark(WebDriver d) 
	{
		driver=d;
	}
	
	public void Toothless_Tiger_Shark()
	{
		driver.findElement(Toothless_Tiger_Shark).click();
	}
	
	public void Return_to_FISH()
	{
		driver.findElement(Return_to_FISH).click();
	}
	
	public void Add_to_Cart()
	{
		driver.findElement(Add_to_Cart).click();
	}

}
