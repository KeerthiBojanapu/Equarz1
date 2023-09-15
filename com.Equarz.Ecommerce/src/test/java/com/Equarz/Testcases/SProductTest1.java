package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.DealsProduct_Functionality2;
import com.Pageobjects.SearchProduct_Functionality1;
import com.base.Testbase1;

public class SProductTest1 extends Testbase1{
	SearchProduct_Functionality1 pf1;
	
	public SProductTest1()
	{
			
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		
		Setup();
		pf1=new SearchProduct_Functionality1 (driver);
		
	}
	@Test
	public void verifyurl() throws InterruptedException
	{
		pf1.validateProduct1();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/product/hp-laptop-15-amd-ryzen-3-7320u-156-inch396cm-fhd-micro-edge-laptop8gb-ram512gb-ssdamd-radeon-graphicsdual-speakersalexan", url);
	}
	
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}


}
