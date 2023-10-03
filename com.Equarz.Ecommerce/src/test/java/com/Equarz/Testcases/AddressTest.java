package com.Equarz.Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.AddandDeleteAddress_Functionality;
import com.Pageobjects.Homelink_Functionality;
import com.Pageobjects.Login_Functionality;
import com.Utils.AddressUtils;
import com.Utils.SignUtils;
import com.base.Testbase;

public class AddressTest extends Testbase {
	AddandDeleteAddress_Functionality af;
	Login_Functionality lg;
	
	
	public AddressTest()
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
	public void initialize() 
	{
		
//		Setup();
//		lg=new Login_Functionality(driver);
//		lg.validateLogin();
		af=new AddandDeleteAddress_Functionality (driver);		
				
	}
	@Test(priority=1,dataProvider = "setdata",dataProviderClass =AddressUtils.class,description = "address added successfully")
	public void addaddress(String name,String phone,String city,String zipcode) throws InterruptedException 
	{
		af.addaddress(name,phone,city,zipcode);
		
	}
	@Test(priority=2,description = "address edited successfully")
	public void editaddress()
	{
		af.editaddress();
	}
	@Test(priority=3,description = "address deleted successfully")
	public void deleteaddress() throws Throwable
	{
		af.deleteaddress();
	}
	

}
