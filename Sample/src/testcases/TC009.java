package testcases;

import org.testng.annotations.Test;

import Jpetstore.HomePage;

public class TC009 extends TC008
{
	@Test
	void test9() 
	{
		HomePage h = new HomePage(driver);
		h.Cart();
		
		if(driver.getTitle().equals("JPetStore Demo")) 
		{
			System.out.println("Testcase9 Pass");
		}
	}	
}
