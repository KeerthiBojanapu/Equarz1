package com.Equarz.Testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Addtocart_Functionality;
import com.Utils.Utils;
import com.base.Testbase;

public class LoginTest extends Testbase {
	Login_Functionality lg;
	
	public LoginTest()
	{
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		
		Setup();
		lg=new Login_Functionality(driver);
		
		
		
	}
//	@Test(priority=1)
//	public void verifylogin() throws InterruptedException
//	{
//		lg.validateLogin();
//	}
    //@Test(dataProvider = "setdata",dataProviderClass = Utils.class)
	@Test
	//public void verifyurl(String username,String password) throws InterruptedException
	public void verifyurl()
	{
		//lg.validateLogin(username,password);
		lg.validateLogin();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/", url);
	}


	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}
	
	



}




