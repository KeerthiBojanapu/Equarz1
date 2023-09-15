package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.Pageobjects.DealsProduct_Functionality2;
import com.base.Testbase1;

public class DProductTest2 extends Testbase1 {
DealsProduct_Functionality2 pf1;
	
	public DProductTest2()
	{
			
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		
		Setup();
		pf1=new DealsProduct_Functionality2 (driver);
		
	}
	@Test
	public void verifyurl() throws InterruptedException
	{
		pf1.validateProduct2();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/product/apple-iphone-13-128gb-green-EovQKP", url);
	}
	
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}

}
