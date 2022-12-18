package com.edusoln.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	
	@CucumberOptions(
			features =  "src\\test\\resources\\Featurefiles"
			,glue = {"com.edusoln.stepDefination"},
			//name = {"com.edusoln.AssignLeaveStepDefination"},
			dryRun = false,
			monochrome = true,
			//tags = "@smoke and not @ignore"
			//tags = "@OrangeHRMLogin"
		    //tags = "@datatable"
			//tags = "@datawithoutExample"
			//tags="@test and not@Login1"
			//tags="@datawithoutExample or @datawithExample"
			
			tags = "@OrangeHRMLogin or @OrangeHRMAssignLeave",
			
			
			plugin= {"pretty","html:target/cucumber-reports/reports.html",
	                "json:target/cucumber-reports/cucumber.json",
	                  "junit:target/cucumber-reports/cucumber.xml",
	                  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
	               
	    
	        )

	public class TestRunner {
		
	
		

}


