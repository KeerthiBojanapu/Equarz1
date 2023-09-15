package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.CategoriesProduct_Functionality;
import com.Utils.Utils;
import com.base.Testbase1;

public class CProductTest extends Testbase1 {
	CategoriesProduct_Functionality pf;
	public CProductTest()
	{
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		
		Setup();
		pf=new CategoriesProduct_Functionality (driver);
		
		
	}
	@Test
	public void verifyurl() throws InterruptedException
	{
		pf.validateProduct();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/product/panasonic-20l-solo-microwave-oven-nn-st26jmfdg-silver-51-auto-menus-C81NSM", url);
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}


}
