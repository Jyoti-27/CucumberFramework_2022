package com.edusoln.stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooksDemo {
	@Before (order=0)
	public void beforeScenario()  {
		System.out.println("In Before Scenario");
		
		
	}
	
	@Before (value = "@tag1 or @tag2",  order=1)
	public void beforetag1()  {
		System.out.println("In Before tag1 Scenario");
		
		
	}
	
	@After
	public void afterScenario()  {
		System.out.println("In After Scenario");
	}

}
