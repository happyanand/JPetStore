package testcases;

import org.testng.annotations.Test;

import Jpetstore.Fish_CategoryPage;

public class TC005 extends TC004
{
	@Test
	void test5() 
	{
		Fish_CategoryPage f = new Fish_CategoryPage(driver);
		f.AngelFish();
		
		if(driver.getTitle().equals("JPetStore Demo")) 
		{
			System.out.println("Testcase5 Pass");
		}
	}	
	
}
