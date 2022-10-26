package testcases;

import org.testng.annotations.Test;
import Jpetstore.HomePage;

class TC002 extends TC001
{
	@Test
	void test2() 
	{
		HomePage h = new HomePage(driver);
		h.Signin();
		if(driver.getTitle().equals("JPetStore Demo")) 
		{
			System.out.println("Testcase2 Pass");
		}
	}
}