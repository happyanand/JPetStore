package testcases;

import org.testng.annotations.Test;
import Jpetstore.HomePage;

public class TC004 extends TC003
{
	@Test
	void test4() 
	{
		HomePage h = new HomePage(driver);
		h.fish_Quick();
		
		if(driver.getTitle().equals("JPetStore Demo")) 
		{
			System.out.println("Testcase4 Pass");
		}
	}	

}