package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Signup_Functionality;
import com.Utils.SignUtils;
import com.base.Testbase;
import com.base.Testbase2;

public class SignupTest extends Testbase2 {
	Signup_Functionality sf;
	public SignupTest()
	{
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		Setup();
		sf=new Signup_Functionality(driver);
		
		
	}
	@Test(dataProvider = "setdata",dataProviderClass = SignUtils.class)
	public void verifyurl(String firstname,String lastname,String Email,String phone,String password,String cpassword) throws InterruptedException
	{
		sf.validateSignup(firstname,lastname,Email,phone,password,cpassword);
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/customer/auth/login", url);
	}
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}

}
