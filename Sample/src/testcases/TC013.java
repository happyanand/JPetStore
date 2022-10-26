package testcases;

import org.testng.annotations.Test;

import Jpetstore.Fish_category.Tiger_Shark;

public class TC013 extends TC012
{
	@Test
	void test13()
	{
		Tiger_Shark t = new Tiger_Shark(driver);
		t.Add_to_Cart();
		
		if(driver.getTitle().equals("JPetStore Demo")) 
		{
			System.out.println("Testcase13 Pass");
		}
	}	
}
