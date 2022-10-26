package testcases;

import org.testng.annotations.Test;

import Jpetstore.Shopping_Cart_Page;

public class TC007 extends TC006
{
	@Test
	void test7() 
	{
		Shopping_Cart_Page s = new Shopping_Cart_Page(driver);
		s.Remove();
		
		if(driver.getTitle().equals("JPetStore Demo")) 
		{
			System.out.println("Testcase7 Pass");
		}
	}	
}
