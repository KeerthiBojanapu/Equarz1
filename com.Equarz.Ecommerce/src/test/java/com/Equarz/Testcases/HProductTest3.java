package com.Equarz.Testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.HomeProduct_Functionality3;
import com.base.Testbase1;

public class HProductTest3  extends Testbase1{
HomeProduct_Functionality3 pf1;
	
	public HProductTest3()
	{
			
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		
		Setup();
		pf1=new HomeProduct_Functionality3 (driver);
		
	}
	@Test
	public void verifyurl() throws InterruptedException
	{
		pf1.validateProduct3();
		//String url=driver.getCurrentUrl();
		
		
		
		//Assert.assertEquals("http://e-quarz.com/product/avro-furniture-set-of-2-plastic-chairs-matt-and-gloss-pattern-plastic-chairs-for-home-living-room-bearing-capacity-up-to", url);
	}
	
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}

}
