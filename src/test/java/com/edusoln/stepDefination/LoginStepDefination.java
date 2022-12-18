package com.edusoln.stepDefination;

import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.edusoln.pom.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	static Logger log=LogManager.getLogger(LoginStepDefination.class);
	@Given("user is login screen")
	public void user_is_login_screen() {
		LoginPage.loginPageDisplayCheck();
		log.info("login check is completed");
	  
	}
	@When("user enters userid and password  on login page")
	public void user_enters_userid_and_password_on_login_page() {
		LoginPage.login();
		log.info("user id and password has been entered");
	    	}
	@When("user enters userid as {string} and password as {string}  on login page")
	public void user_enters_userid_as_and_password_as_on_login_page(String userid, String password) {
	    LoginPage.login(userid,password);
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		  LoginPage.login(string,string2);
		  log.info("user id and password has been entered");
	}
	@When("user enters credentials on login page")
	public void user_enters_credentials_on_login_page(DataTable datatable) {
		List<Map<String,String>> data=datatable.asMaps();
		for(Map<String,String> d:data)  {
			System.out.println(d.get("userid")  + "_"  + d.get("password"));
			LoginPage.login(d.get("userid"), d.get("password"));
			log.info("user id and password has been entered");
			
		}
	 
	}
	@When("user clicks on Login button")
	 public void user_clicks_on_login_button() {
		LoginPage.clickLobinbtn();
		log.info("login button is clicked");
	 }

	@Then("user should able to see dashboard page")
	public void user_should_able_to_see_dashboard_page() {
		LoginPage.dashBoardDisplayCheck();
		log.info("login is successful");
	   
	}


	
}
	