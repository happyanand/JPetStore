package testcases;

import org.testng.annotations.Test;

import Jpetstore.Fish_CategoryPage;

public class TC012 extends TC011
{
	@Test
	void test12()
	{
		Fish_CategoryPage f = new Fish_CategoryPage(driver);
		f.Tiger_Shark();
		
		if(driver.getTitle().equals("JPetStore Demo")) 
		{
			System.out.println("Testcase12 Pass");
		}
	}	
}
