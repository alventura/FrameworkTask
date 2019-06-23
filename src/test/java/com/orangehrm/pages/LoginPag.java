package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass2;
import com.orangehrm.utils.CommonMethod;


public class LoginPag extends BaseClass2 {
	//locating WebElement using @FindBy annotation
	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(name="txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement loginBtn;
	
	@FindBy(css="img[src*='login']")
	public WebElement logo;
	
	@FindBy(xpath="//div[@class='toast-message']")
	public WebElement wrongCredentials;
	//initialize all of our variables
	 
	public void login(String uname,String pwd) {
	  		CommonMethod.sendText(username,uname);
	  	    CommonMethod.sendText(password,pwd);
	  	    loginBtn.click();
	  	}
	
	public LoginPag(){
		PageFactory.initElements(driver,this);
	}
	
	

}
