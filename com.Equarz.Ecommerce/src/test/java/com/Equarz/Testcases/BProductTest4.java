package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Bannerproduct_Functionality;
import com.Pageobjects.SearchProduct_Functionality1;
import com.base.Testbase1;

public class BProductTest4 extends Testbase1 {
Bannerproduct_Functionality pf1;
	
	public BProductTest4()
	{
			
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		
		Setup();
		pf1=new Bannerproduct_Functionality (driver);
		
	}
	@Test
	public void verifyurl() throws InterruptedException
	{
		pf1.validateProduct14();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/product/jodhpuri-blazer-for-men-black-formal-casual-svSGUX", url);
	}
	
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}



}
