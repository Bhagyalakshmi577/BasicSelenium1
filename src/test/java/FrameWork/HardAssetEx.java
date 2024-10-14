package FrameWork;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.expectThrows;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssetEx {

	@Test
	public void m1()
	{

		System.out.println("Step1");
		System.out.println("Step2");
		Assert.assertEquals(false, false);
		System.out.println("Step3");
		System.out.println("Step4");
	}
	
	@Test
	public void m2()
	{
		String expResult = "qspider";
		String actResult = "qspide";
		Assert.assertEquals(actResult,expResult);			
	}

}
