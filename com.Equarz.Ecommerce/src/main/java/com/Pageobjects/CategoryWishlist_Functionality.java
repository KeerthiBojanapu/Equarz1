package com.Pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase1;

public class CategoryWishlist_Functionality extends Testbase1{
	@FindBy(id="si-email")
	WebElement user;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement signinbtn;
	@FindBy(xpath="//span[text()='TVs & Appliances']")
	WebElement cat;
	@FindBy(xpath="//span[text()='Microwave oven']")
	WebElement subcat;
	@FindBy(xpath="//a[text()='Premium']")
	WebElement subsub;
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/wipro-vesta-ctg01-28-l-oven-toast-grillotg-1600-watt-with-smart-cook-function-rotisserie-convection-6-stage-heating-gril']")
    WebElement product;
	@FindBy(xpath="//i[@class='fa fa-heart-o ']")
	WebElement wishlist;
	@FindBy(xpath="//i[@class='navbar-tool-icon czi-heart']")
	WebElement heart;
	@FindBy(xpath="//i[@class='czi-close-circle']")
	WebElement remove;
	@FindBy(xpath="//div[text()='Product has been remove from wishlist!']")
	WebElement msg;
	public CategoryWishlist_Functionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void validateWishlist() throws InterruptedException 
	{
		user.sendKeys(props.getProperty("username"));
		pass.sendKeys(props.getProperty("password"));
		Thread.sleep(10000);
		signinbtn.click();
		Actions ac=new Actions(driver);
		ac.moveToElement(cat).build().perform();
		Thread.sleep(3000);
		ac.moveToElement(subcat).build().perform();
		subsub.click();		
		product.click();
		wishlist.click();
		Thread.sleep(2000);
		heart.click();
		remove.click();
		String print=msg.getText();
		assertEquals("Product has been remove from wishlist!",print);
		
		
		
	}
	

}
