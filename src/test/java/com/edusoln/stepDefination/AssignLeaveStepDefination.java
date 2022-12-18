package com.edusoln.stepDefination;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import com.edusoln.pom.AssignLeavePage;
import com.edusoln.pom.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignLeaveStepDefination  {
	static Logger log=LogManager.getLogger(AssignLeaveStepDefination.class);
	
	@Given("user is already logged in and is on Dashboard page")
	public void user_is_already_logged_in_and_is_on_dashboard_page() {
	    LoginPage.login();
	    LoginPage.clickLobinbtn();
	    LoginPage.dashBoardDisplayCheck();
	    log.info("Login is completed");
	}


	@When("user enters {string} , {string} , {string} , {string} , {string} on Assign Leave Page")
	public void user_enters_on_assign_leave_page(String string, String string2, String string3, String string4, String string5) {
		 AssignLeavePage.enterAssignLeaveForm(string, string2,string3,string4,string5 );
		   log.info("Assign leave form is filled");
	}

	@When("user clicks on assign button")
	public void user_clicks_on_assign_button() {
		 AssignLeavePage.submitLeave();
		   log.info("Leave submission is done");
	}

	@Then("user should able to get Assign leave successfully")
	public void user_should_able_to_get_assign_leave_successfully() {
		 AssignLeavePage.assignLeaveSucessCheck();
		   log.info("Leave is applied successfully");
}
	}

