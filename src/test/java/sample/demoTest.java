package sample;

import org.testng.annotations.Test;

public class demoTest 
{

	@Test(groups = "smoke")
	public void demopractice1Test()
	{
		System.out.println("--demo 1Smoke--");
		System.out.println(" ");
	}
	
	@Test(groups = "regression")
	public void demopractice2Test()
	{
		System.out.println("--demo 2 regression--");
	}
}
