package testcases;

import org.testng.annotations.Test;

import Jpetstore.Angelfish;

public class TC020 extends TC005
{
	@Test
	void test20() 
	{
		Angelfish af = new Angelfish(driver);
		af.Large_Angelfish();
		
		if(driver.getTitle().equals("JPetStore Demo")) 
		{
			System.out.println("Testcase20 Pass");
		}
	}	

}
