package com.Pageobjects;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Utils;
import com.base.Testbase;

public class Search_Functionality extends Testbase {
	@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
	WebElement searchbar;
	
	@FindBy(xpath="//li[@class='list-group-item']")
	List<WebElement> ele;
	
	
	
	public Search_Functionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	public void validatesearch() 
	{
		
		searchbar.sendKeys(props.getProperty("product"));
		searchbar.sendKeys(Keys.ENTER);
		String str=driver.getCurrentUrl();
		assertEquals("http://e-quarz.com/products?name=laptop&data_from=search&page=1", str);

}
	public void dropdownsearch() throws InterruptedException 
	{
		
		searchbar.sendKeys(props.getProperty("product1"),Keys.ENTER);
		Thread.sleep(3000);
		for(WebElement ele1:ele)
		{
			
			if(ele1.getText().equals("Apple iPhone 11 (64GB) - White"))
					{
				ele1.click();
				String str=driver.getCurrentUrl();
				assertEquals("http://e-quarz.com/products?name=Apple+iPhone+11+%2864GB%29+-+White&data_from=search&page=1", str);
				
					}
		}
			
		
		

}
	
}
