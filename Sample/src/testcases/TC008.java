package testcases;

import org.testng.annotations.Test;

import Jpetstore.Shopping_Cart_Page;

public class TC008 extends TC007
{
	@Test
	void test8() 
	{
		Shopping_Cart_Page s = new Shopping_Cart_Page(driver);
		s.Return_to_Main_Menu();
				
		if(driver.getTitle().equals("JPetStore Demo")) 
		{
			System.out.println("Testcase8 Pass");
		}
	}	
}
