package Jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{	
	WebDriver driver;
	
	@FindBy(xpath = "//a[.='Enter the Store']")
	WebElement Enter_Store;
	
	By Sign_In = By.xpath("//a[.='Sign In']");
	By Search_Txt = By.xpath("//input[@type='text']");
	By Search_Btn = By.xpath("//input[@type='submit']");
	
	By Cart = By.xpath("//img[@name='img_cart']");
	
	By Fish_QuickLink = By.xpath("//*[@id='QuickLinks']/a[1]/img");
	By Fish_SidebarLink =By.xpath("//*[@id='SidebarContent']/a[1]/img");
	By Fish_MainimgLink = By.xpath("//*[@id='MainImageContent']/map/area[2]");
	
	By Dogs_QuickLink = By.xpath("//*[@id='QuickLinks']/a[2]/img");
	By Dogs_SidebarLink = By.xpath("//*[@id='SidebarContent']/a[2]/img");
	By Dogs_MainimgLink = By.xpath("//*[@id='MainImageContent']/map/area[3]");
	
	By Reptiles_QuickLink = By.xpath("//*[@id='QuickLinks']/a[3]/img");
	By Reptiles_SidebarLink =By.xpath("//*[@id='SidebarContent']/a[4]/img");
	By Reptiles_MainimgLink = By.xpath("//*[@id='MainImageContent']/map/area[4]");
	
	By Cats_QuickLink = By.xpath("//*[@id='QuickLinks']/a[4]/img");
	By Cats_SidebarLink = By.xpath("//*[@id='SidebarContent']/a[3]/img");
	By Cats_MainimgLink = By.xpath("//*[@id='MainImageContent']/map/area[5]");
	
	By Birds_QuickLink = By.xpath("//*[@id='QuickLinks']/a[5]/img");
	By Birds_SidebarLink = By.xpath("//*[@id='SidebarContent']/a[5]/img");
	By Birds_MainimgLink = By.xpath("//*[@id='MainImageContent']/map/area[6]");
	
	By Birds_MainimgLink1 = By.xpath("//*[@id='MainImageContent']/map/area[1]");
	
	By MyBatis = By.xpath("//*[@id='PoweredBy']/a");
	
	public HomePage(WebDriver d) 
	{
		driver=d;
	}
	
	public void Signin()
	{
		driver.findElement(Sign_In).click();
	}
	
	public void Search_Txt(String products)
	{
		driver.findElement(Search_Txt).clear();
		driver.findElement(Search_Txt).sendKeys(products);
	}
	
	public void Search_Btn()
	{
		driver.findElement(Search_Btn).click();
	}	
	
	public void Cart()
	{
		driver.findElement(Cart).click();
	}
	
	public void fish_Quick()
	{
		driver.findElement(Fish_QuickLink).click();
	}
	public void fish_SidebarLink()
	{
		driver.findElement(Fish_SidebarLink).click();
	}
	public void fish_MainimgLink()
	{
		driver.findElement(Fish_MainimgLink).click();
	}
	
	public void dogs_Quick()
	{
		driver.findElement(Dogs_QuickLink).click();
	}
	public void dogs_SidebarLink()
	{
		driver.findElement(Dogs_SidebarLink).click();
	}
	public void dogs_MainimgLink()
	{
		driver.findElement(Dogs_MainimgLink).click();
	}	
	
	public void Reptiles_QuickLink()
	{
		driver.findElement(Reptiles_QuickLink).click();
	}
	public void Reptiles_SidebarLink()
	{
		driver.findElement(Reptiles_SidebarLink).click();
	}
	public void Reptiles_MainimgLink()
	{
		driver.findElement(Reptiles_MainimgLink).click();
	}	
	
	public void Cats_QuickLink()
	{
		driver.findElement(Cats_QuickLink).click();
	}
	public void Cats_SidebarLink()
	{
		driver.findElement(Cats_SidebarLink).click();
	}
	public void Cats_MainimgLink()
	{
		driver.findElement(Cats_MainimgLink).click();
	}	
	
	public void Birds_QuickLink()
	{
		driver.findElement(Birds_QuickLink).click();
	}
	public void Birds_SidebarLink()
	{
		driver.findElement(Birds_SidebarLink).click();
	}
	public void Birds_MainimgLink()
	{
		driver.findElement(Birds_MainimgLink).click();
	}	
	
	public void Birds_MainimgLink1()
	{
		driver.findElement(Birds_MainimgLink1).click();
	}	
	
	public void MyBatis()
	{
		driver.findElement(MyBatis).click();
	}
	
	
	
	
	
	
	
}