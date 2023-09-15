package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase1;

public class DealsProduct_Functionality2 extends Testbase1 {
	@FindBy(xpath="//button[@class='close __close']")
	WebElement popclose;
	@FindBy(xpath="//button[@class='buy_btn']")
	WebElement buynow;
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addtocart;
	public DealsProduct_Functionality2 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public Homepage validateProduct2() throws InterruptedException
	{
		popclose.click();
		buynow.click();
		addtocart.click();
		return new Homepage();
		
	}
	

}
