package testcases;

import org.testng.annotations.Test;

import Jpetstore.SignInPage;

public class TC015 extends TC002
{
	@Test
	void test4() 
	{
		SignInPage s = new SignInPage(driver);
		s.Register();
		if(driver.getTitle().equals("JPetStore Demo")) 
		{
			System.out.println("Testcase15 Pass");
		}
	}
}
