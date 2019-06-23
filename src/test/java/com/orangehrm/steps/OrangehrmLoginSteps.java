package com.orangehrm.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPag;
import com.orangehrm.utils.CommonMethod;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class OrangehrmLoginSteps extends CommonMethod {
	LoginPag login=new LoginPag();
	

	@Given("I see the Orangehrm logo")
	public void i_see_the_Orangehrm_logo() {
	  login=new LoginPag();
	  boolean isDisplayed=login.logo.isDisplayed();
	  Assert.assertTrue(isDisplayed);
	}

	@When("I enter correct credentials")
	public void i_enter_correct_credentials() {
	   CommonMethod.sendText(login.username, "Admin");
	   sendText(login.password,"dL8YYc0@Ax");
	   
	}

	@When("I click login")
	public void i_click_login() {
		click(login.loginBtn);
	}

	@Then("I see the Homepage")
	public void i_see_the_Homepage() {
	    HomePage home=new HomePage();
	    Assert.assertTrue(home.dashboardText.isDisplayed());
	}
	@Then("I close browser")
	public void i_close_browser() {
	   tearDown();

}
	@When("I enter incorrect credentials")
	public void i_enter_incorrect_credentials() {
	 CommonMethod.sendText(login.username, "Test");
	 CommonMethod.sendText(login.password, "Test123");
	}

	@Then("I see the error message")
	public void i_see_the_error_message() {
	   Assert.assertTrue(login.wrongCredentials.isDisplayed());
	}
	@When("I enter invalid username and password I see errorMessages")
	public void i_enter_invalid_username_and_password_I_see_errorMessages(DataTable dataTable) {
	  List<Map<String,String>> listOfErrors=dataTable.asMaps(String.class, String.class);
	  for(Map<String,String> map:listOfErrors) {
	  sendText(login.username,map.get("userName"));
	  sendText(login.password,map.get("password"));
	  click(login.loginBtn);
	  String error=map.get("errorMessage");
	  String errorDisplayed=login.wrongCredentials.getText().trim();
	  Assert.assertEquals(errorDisplayed,error);
	  }
	  }
}