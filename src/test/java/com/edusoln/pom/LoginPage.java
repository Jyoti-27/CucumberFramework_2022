package com.edusoln.pom;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.edusoln.base.CommonFunctions;
import com.edusoln.utilities.PropertyReader;

public class LoginPage extends CommonFunctions {
	
	public static void login()  {
		driver.findElement(By.name(PropertyReader.getProperty("username_name"))).sendKeys("Admin");
		driver.findElement(By.id(PropertyReader.getProperty("password_id"))).sendKeys("admin123");
		
	}
	
	public static void login(String userid, String pass)  {
		driver.findElement(By.name(PropertyReader.getProperty("username_name"))).sendKeys(userid);
		driver.findElement(By.id(PropertyReader.getProperty("password_id"))).sendKeys(pass);
		
	}
	
	public static void dashBoardDisplayCheck()  {
		Assert.assertTrue(driver.findElement(By.id(PropertyReader.getProperty("dashboardMenu_id"))).isDisplayed());
		
	}
	
	public static void loginPageDisplayCheck() {
        Assert.assertTrue(driver.findElement(By.id("logInPanelHeading")).isDisplayed());
    }
	
	public static void clickLobinbtn() {
	       driver.findElement(By.id(PropertyReader.getProperty("loginBtn_id"))).click();
	    }

}
