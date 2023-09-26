package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Addtocart_Functionality;
import com.Utils.Utils;
import com.base.Testbase;


public class AddtocartTest extends Testbase {
	Addtocart_Functionality pf;
	Login_Functionality lg;
	public AddtocartTest()
	{
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		
		Setup();
		lg=new Login_Functionality(driver);
		lg.validateLogin();
		pf=new Addtocart_Functionality (driver);
		
		
	}
	@Test(priority=1)
	public void verifyurl() throws InterruptedException
	{
		pf.categorylist();
		//String url=driver.getCurrentUrl();
		//Assert.assertEquals("http://e-quarz.com/product/panasonic-20l-solo-microwave-oven-nn-st26jmfdg-silver-51-auto-menus-C81NSM", url);
	}
	@Test(priority=2)
	public void dealproduct() throws InterruptedException
	{
		pf.dealslist();
	}
	@Test(priority=3)
	public void homeproduct() throws InterruptedException
	{
		pf.homelist();
	}
	@Test(priority=4)
	public void searchproduct() throws InterruptedException
	{
		pf.searchlist();
	}
	@Test(priority=5)
	public void bannerproduct() throws InterruptedException
	{
		pf.bannerlist();
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}


}
