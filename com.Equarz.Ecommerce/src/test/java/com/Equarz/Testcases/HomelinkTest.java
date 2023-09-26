package com.Equarz.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Homelink_Functionality;
import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Search_Functionality;
import com.base.Testbase;

public class HomelinkTest extends Testbase {
	Homelink_Functionality hf;
	Login_Functionality lg;
	
	
	public HomelinkTest()
	{
		super();
	}
	@BeforeMethod
	public void initialize() throws InterruptedException
	{
		
		Setup();
		lg=new Login_Functionality(driver);
		lg.validateLogin();
		hf=new Homelink_Functionality (driver);		
				
	}
	@Test()
	public void search () throws InterruptedException 
	{
		hf.validatelinks();
		
	}

}
