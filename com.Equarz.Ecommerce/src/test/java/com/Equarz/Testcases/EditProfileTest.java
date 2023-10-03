package com.Equarz.Testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.EditProfileFunctionality;
import com.Pageobjects.Login_Functionality;
import com.base.Testbase;

public class EditProfileTest extends Testbase {
	EditProfileFunctionality ef;
	Login_Functionality lg;
	
	
	public EditProfileTest ()
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
		ef=new EditProfileFunctionality (driver);		
				
	}
	@Test()
	public void search() throws InterruptedException, AWTException 
	{
		ef.editprofie();
		
	}

}
