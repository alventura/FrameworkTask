package com.orangehrm.steps;


import com.orangehrm.pages.AddEmployeePage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPag;
import com.orangehrm.utils.CommonMethod;
import com.orangehrm.utils.ConfigReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.Collections;
import java.util.List;



//import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
public class AddEmployeeSteps extends CommonMethod {
	 AddEmployeePage emp;
	LoginPag login;
	HomePage home;
	 
	 @Given("I logged in into OrangeHrm")
		public void i_logged_in_into_OrangeHrm() {
			login = new LoginPag();
			home = new HomePage();
			emp = new AddEmployeePage();
			login.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
		}


	@When("I click on PIM link")
	public void i_click_on_PIM_link() {
	   emp=new AddEmployeePage();
	   click(emp.PIM);
	   
	}
	@When("I click on Add Employee")
	public void i_click_on_Add_Employee() {
		click(emp.addEmployee);
	}
	
	@When("I provide Employee name {string} and {string} and {string}")
	public void i_provide_Employee_name_and_and_and_location(String eName, String lName, String location) throws InterruptedException {
		Thread.sleep(2000);
	sendText(emp.firstName,eName);
	sendText(emp.lastName,lName);
	click(emp.location);
	selectList(emp.locationList, location);
	} 
	
	@When("I click on next")
	public void i_click_on_next() {
	   emp.next.click();
	}

	@Then("I see employee is added successfully")
	public void i_see_employee_is_added_successfully() {
		String verify=emp.personalDetails.getText();
		System.out.println(verify);
		Assert.assertEquals(verify, "Personal Details");
		
	}
	
	@When("I click on Create Credentials")
	public void i_click_on_Create_Credentials() throws InterruptedException {
	   Thread.sleep(3000);
		click(emp.createLogin);
	}

	@When("I provide Employee name {string} and {string} and {string} and {string} and {string} and {string}")
	public void i_provide_Employee_name_and_and_and_and_and(String eName, String lName, String location, String username, String password, String confirmP) {
		sendText(emp.firstName,eName);
		sendText(emp.lastName,lName);
		click(emp.location);
		selectList(emp.locationList, location);
		sendText(emp.userN,username);
		sendText(emp.empPassword,password);
		sendText(emp.confirm,confirmP);
	}

	@When("I click and select Status and ESSRole and SupRole and AdminRole")
	public void i_click_and_select_Status_and_ESSRole_and_SupRole_and_AdminRole() {
	    click(emp.status);
	    selectList(emp.statusList,"Enabled");
	    click(emp.role);
	    selectList(emp.roleOptions,"Default ESS");
	    click(emp.supervisorRole);
	    selectList(emp.supervisorOption,"Default Supervisor");
	    click(emp.adminRole);
	    selectList(emp.adminRoleList,"Time Manager");
	}
	

	@Then("I see following labels")
	public void i_see_following_labels(DataTable addEmpLabels) {
	  
		List<String> labels=addEmpLabels.asList();
		
		for(String label: labels) {
			System.out.println(label);
		}
		
		System.out.println("------------------------------");
		List<WebElement> labelList = emp.labelsTable;
		for(WebElement label: labelList) {
			String labeltxt=label.getText();
			System.out.println(labeltxt);
			
			
		}
		
		
		
	}

	

}
