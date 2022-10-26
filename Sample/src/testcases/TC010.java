package testcases;

import org.testng.annotations.Test;

import Jpetstore.Shopping_Cart_Page;

public class TC010 extends TC009
{
	@Test
	void test10() 
	{
		Shopping_Cart_Page s = new Shopping_Cart_Page(driver);
		s.Return_to_Main_Menu();
		
		if(driver.getTitle().equals("JPetStore Demo")) 
		{
			System.out.println("Testcase10 Pass");
		}
	}	
}
