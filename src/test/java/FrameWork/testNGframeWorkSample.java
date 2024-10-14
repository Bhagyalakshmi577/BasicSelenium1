package FrameWork;

import org.testng.annotations.Test;

//@Test
//public class testNGframeWorkSample 
//{	
//	@Test(priority = -2)
//	public void createContact()
//	{
//		System.out.println("Contact Created");
//	}
//	@Test(priority = -1)
//	public void ModifyContact()
//	{
//		System.out.println("Modify the contect");
//	}
//	@Test(priority = 0)
//	public void deleteContact()
//	{
//		System.out.println("Delete contact");
//	}


//dependednt Method won't execute if independent method fails
public class testNGframeWorkSample 
{	
	@Test
	public void createContact()
	{
		System.out.println("Contact Created");
	}
	@Test(dependsOnMethods = "createContact")
	public void ModifyContact()
	{
		System.out.println("Modify the contect");
	}
	@Test(dependsOnMethods = "createContact")
	public void deleteContact()
	{
		System.out.println("Delete contact");
	}
	
	@Test(dependsOnMethods = {"deleteContact","ModifyContact"})
	public void changeMethod()
	{
		System.out.println("Change the Value");
	}
	
	//it will not execute the method
	@Test(enabled = false)
	public void CompleteMethod()
	{
		System.out.println("Complete method");
	}
	@Test(invocationCount = 3)
	public void multipleRun()
	{
		System.out.println("multiple method");
	}
	

}
