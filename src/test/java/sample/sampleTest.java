package sample;

import org.testng.annotations.Test;

public class sampleTest {

	@Test(groups = "regression")
	public void sample1Test()
	{
		System.out.println("--sample test2--");
	}
	
	@Test(groups = {"smoke","regression"})
	public void sample2Test()
	{
		System.out.println("--sample test2--");
	}
	
}
