package com.orangehrm.steps;

import com.orangehrm.utils.BaseClass2;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void start(Scenario scenario) {
		BaseClass2.setUp();
		System.out.println("Starting test: "+scenario.getName());
		
	}
	
	@After
	public void end(Scenario scenario) {
		BaseClass2.tearDown();
		System.out.println("Ending test: "+scenario.getName());
	}
	
}
