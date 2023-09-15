package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.CategoriesProduct_Functionality;
import com.Pageobjects.CategoryWishlist_Functionality;
import com.Pageobjects.Login_Functionality;
import com.Utils.Utils;
import com.base.Testbase1;

public class WishlistTest extends Testbase1{
	CategoryWishlist_Functionality pf;
	
	public WishlistTest()
	{
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		
		Setup();
		pf=new CategoryWishlist_Functionality (driver);
		
		
		
	}
	@Test
	public void verifyurl() throws InterruptedException
	{
		pf.validateWishlist();
//		String url=driver.getCurrentUrl();
//		Assert.assertEquals("http://e-quarz.com/wishlists", url);
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}


}
