package Jpetstore;

import org.openqa.selenium.*;

public class LinkPage
{
	WebDriver driver;
	
    //This is one Method for Find by Elements
	
	By Enter_Store = By.xpath("//a[.='Enter the Store']");
	
	public LinkPage(WebDriver d)
	{
		//this.driver=driver;
		driver = d;
	}
	public void EnterStore()
	{
		driver.findElement(Enter_Store).click();
	}	
}