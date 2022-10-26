package testcases;

import org.testng.annotations.Test;

import Jpetstore.Angelfish;

public class TC006 extends TC005
{
	@Test
	void test6() 
	{
		Angelfish af = new Angelfish(driver);
		af.Add_to_Cart1();
		
		if(driver.getTitle().equals("JPetStore Demo")) 
		{
			System.out.println("Testcase6 Pass");
		}
	}	
}
