package com.edusoln.stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDefination {
	@Given("user needs to access application")
	public void user_needs_to_access_application() {
	    System.out.println("In Background Given");
	}
	
	
	@Then("user should have internet connection")
	public void user_should_have_internet_connection() {
		System.out.println("In Background Then");
	}

	@Given("user is on Login page")
	public void user_is_on_login_page() {
	    System.out.println("in Given");
	}

	@When("user enters userid and password")
	public void user_enters_userid_and_password() {
		System.out.println("in when1");
	    
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
		System.out.println("in when2");
	   
	}

	@Then("user is able to see dashboard screen")
	public void user_is_able_to_see_dashboard_screen() {
		System.out.println("in then");
	    
	}


}
