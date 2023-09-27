package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Addtocart_Functionality;
import com.Pageobjects.Wishlist_Functionality;
import com.Pageobjects.Login_Functionality;
import com.Utils.Utils;
import com.base.Testbase;


public class WishlistTest extends Testbase{
	Wishlist_Functionality wf;
	Login_Functionality lg;
	
	
	public WishlistTest()
	{
		super();
	}
	@BeforeClass
	public void login()
	{
		Setup();
		lg=new Login_Functionality(driver);
		lg.validateLogin();
		
	}
	@BeforeMethod
	public void initialize() throws InterruptedException
	{
		
//		Setup();
//		lg=new Login_Functionality(driver);
//		lg.validateLogin();
		wf=new Wishlist_Functionality (driver);		
				
	}
	@Test()
	public void categorywishlist () throws InterruptedException 
	{
		wf.catwishlist();
		
	}
	
	@Test()
	public void searchwishlist() 
	{
		wf.searchwishlist();
	}
	@Test()
	public void bannerhwishlist() 
	{
		wf.bannerwishlist();
	}
	@Test()
	public void homehwishlist() 
	{
		wf.homewishlist();
	}
	@Test()
	public void dealswishlist() 
	{
		wf.dealswishlist();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}


}
