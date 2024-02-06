package sample;

import org.testng.annotations.Test;

public class jenkinsTest {

	@Test(groups = "regression")
	public void jenkins1Test()
	{
		System.out.println("---jenkinstest Regression1---");
	}
	
	@Test(groups = "smoke")
	public void jenkins2Test()
	{
		System.out.println("---jenkinstest Smoke2---");
	}
}
