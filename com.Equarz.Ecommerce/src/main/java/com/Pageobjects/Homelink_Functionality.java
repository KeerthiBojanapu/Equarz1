package com.Pageobjects;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Homelink_Functionality extends Testbase {
	@FindBy(xpath="//h6[text()='Special']")
	WebElement scroll;
	@FindBy(xpath="//a[text()='Featured Products']")
	WebElement featureproduct;
	@FindBy(xpath="//a[text()='Latest Products']")
	WebElement latest;
	@FindBy(xpath="//a[text()='Best Selling Products']")
	WebElement sellingprod;
	@FindBy(xpath="//a[text()='Top Rated Products']")
	WebElement toprated;
	@FindBy(xpath="//a[text()='Profile Info']")
	WebElement profileinfo;
	@FindBy(xpath="//a[text()='Track Order']")
	WebElement trackorder;
	@FindBy(xpath="//a[text()='Refund policy']")
	WebElement refund;
	@FindBy(xpath="//a[text()='Return policy']")
	WebElement returnpolicy;
	@FindBy(xpath="//a[text()='Cancellation policy']")
	WebElement cancellation;
	@FindBy(xpath="//i[@class='fa fa-phone m-2']")
	WebElement phone;
	@FindBy(xpath="//i[@class='fa fa-envelope m-2']")
	WebElement mail;
	
	
	
	public Homelink_Functionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	public void validatelinks() throws InterruptedException 
	{
		Point loc=scroll.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);
		featureproduct.click();
		Thread.sleep(2000);
		latest.click();
		sellingprod.click();
		toprated.click();
		profileinfo.click();
		trackorder.click();
		refund.click();
		returnpolicy.click();
		cancellation.click();
		phone.click();
		mail.click();
		
		
		
		
	}

}
