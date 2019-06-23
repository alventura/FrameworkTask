package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass2;


public class AddLocations extends BaseClass2{
	
	
	@FindBy(xpath="//a[@ng-click='locationCtrl.addLocation()']//i")
	public WebElement add;
	
	@FindBy(id="name")
	public WebElement name;
	
	@FindBy(xpath="//div[@id='countryCode_inputfileddiv']//input")
	public WebElement location;
	
	@FindBy(xpath="//div[@id='countryCode_inputfileddiv']//ul")
	public WebElement locationList;
	
	@FindBy(xpath="//div[@id='time_zone_inputfileddiv']//input")
	public WebElement timeZone;
	
	@FindBy(xpath="//div[@id='time_zone_inputfileddiv']//ul")
	public WebElement zones;
	
	@FindBy(css="input#city")
	public WebElement cities;
	
	
	public AddLocations(){
		PageFactory.initElements(driver,this);
	}
	

}
