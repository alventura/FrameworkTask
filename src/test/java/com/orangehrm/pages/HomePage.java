package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass2;


public class HomePage extends BaseClass2 {
	
	@FindBy(xpath="//li[text()='Dashboard']")
	public WebElement dashboardText;
	
	@FindBy(linkText="Admin")
	public WebElement admin;
	
	@FindBy(linkText="Organization")
	public WebElement organization;
	
	@FindBy(linkText="Locations")
	public WebElement locations;
	

	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	
}
