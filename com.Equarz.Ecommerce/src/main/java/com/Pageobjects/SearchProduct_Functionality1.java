package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase1;

public class SearchProduct_Functionality1 extends Testbase1 {
	@FindBy(xpath="//button[@class='close __close']")
	WebElement popclose;	
	
	@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
	WebElement search;
	@FindBy(xpath="//button[@class='input-group-append-overlay search_button']")
	WebElement searchbtn;
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/hp-247-g8-laptop-amd-athlon-p-3045b-hd-14-inches355cm-hd-8gb-ram-ddr4-1tb-hddwindows-11-home-w11-sl-one-year-warranty-bl']")
	WebElement product;
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addtocart;

	
	public SearchProduct_Functionality1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public Homepage validateProduct1() throws InterruptedException
	{
		popclose.click();
		search.sendKeys(props.getProperty("product"));
		searchbtn.click();

		addtocart.click();
		
		return new Homepage();
	}

}
