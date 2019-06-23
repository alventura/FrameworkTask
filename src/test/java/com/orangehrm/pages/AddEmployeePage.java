package com.orangehrm.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.orangehrm.utils.BaseClass2;


public class AddEmployeePage extends BaseClass2 {
	
	@FindBy(partialLinkText="PIM")
    public WebElement PIM;
    @FindBy(partialLinkText="Add Employee")
    public WebElement addEmployee;
    @FindBy(id="firstName")
    public WebElement firstName;
    
    @FindBy(id="middleName")
    public WebElement middleName;
    
    @FindBy(id="lastName")
    public WebElement lastName;
    @FindBy(id="employeeId")
    public WebElement employeeId;
     
    @FindBy(xpath="//div[@id='location_inputfileddiv']//input")
    public WebElement location;
    
    @FindBy(xpath="//div[@id='location_inputfileddiv']//ul")
    public WebElement locationList;
    
    @FindBy(id="systemUserSaveBtn")
    public WebElement next;
    
    @FindBy(xpath="//div[@id='personal_details_tab']/h4")
    public WebElement personalDetails;
    
    @FindBy(xpath="//label[@for='hasLoginDetails']")
    public WebElement createLogin;
    
    @FindBy(id="username")
    public WebElement userN;
    
    @FindBy(xpath="//div[@id='status_inputfileddiv']/div")
    public WebElement status;
    
    @FindBy(xpath="//div[@id='status_inputfileddiv']//ul")
    public WebElement statusList;
    
    @FindBy(id="password")
    public WebElement empPassword;
    
    @FindBy(xpath="//input[@id='confirmPassword']")
    public WebElement confirm;
    
    @FindBy(xpath="//div[@id=\"essRoleId_inputfileddiv\"]//input")
    public WebElement role;
    
    @FindBy(xpath="//div[@id='essRoleId_inputfileddiv']//ul")
    public WebElement roleOptions;
    
    @FindBy(xpath="//div[@id=\"adminRoleId_inputfileddiv\"]//input")
    public WebElement adminRole;
    
    @FindBy(xpath="//div[@id=\"adminRoleId_inputfileddiv\"]//ul")
    public WebElement adminRoleList;
    
    @FindBy(xpath="//div[@id=\"supervisorRoleId_inputfileddiv\"]//input")
    public WebElement supervisorRole;
    
    @FindBy(xpath="//div[@id=\"supervisorRoleId_inputfileddiv\"]//ul")
    public WebElement supervisorOption;
    
    @FindBy(xpath="//div[@id='wizard-nav-button-section']/button[2]")
    public WebElement nextB;
    
    @FindBy(xpath="//form[@id='pimAddEmployeeForm']//label")
    public List <WebElement> labelsTable;
    
    public AddEmployeePage() {
        PageFactory.initElements(driver,this);
    }
	
	
}
