package testcases;

import org.testng.annotations.Test;

import Jpetstore.HomePage;

public class TC021 extends TC010
{
	@Test
	void test21() 
	{
		HomePage h = new HomePage(driver);
		h.MyBatis();
				
		if(driver.getTitle().equals("The MyBatis Blog")) 
		{
			System.out.println("Testcase21 Pass");
		}
	}	
}
