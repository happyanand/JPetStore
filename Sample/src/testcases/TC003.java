package testcases;

import org.testng.annotations.Test;
import Jpetstore.SignInPage;


public class TC003 extends TC002
{
	@Test
	void test3() 
	{
		SignInPage s = new SignInPage(driver);
		s.Username();
		s.Password();
		s.Login();
		if(driver.getTitle().equals("JPetStore Demo")) 
		{
			System.out.println("Testcase3 Pass");
		}
	}
}
