package testcases;

import org.testng.annotations.Test;

import Jpetstore.HomePage;

public class TC011 extends TC003
{
	@Test
	void test11()
	{
		HomePage h = new HomePage(driver);
		h.fish_SidebarLink();
		
		if(driver.getTitle().equals("JPetStore Demo")) 
		{
			System.out.println("Testcase11 Pass");
		}
	}	
}
