package com.edusoln.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import com.aventstack.extentreports.Status;
import com.edusoln.base.CommonFunctions;
import com.edusoln.utilities.PropertyReader;

public class AssignLeavePage extends CommonFunctions {
	

	static String balanceText;

	
	public static void enterAssignLeaveForm(String empName, String leaveType, String fromDate, String toDate, String comment) {
	
		cickElement(driver.findElement(By.className(PropertyReader.getProperty("assignleave_btn_className"))));			
		driver.findElement(By.id(PropertyReader.getProperty("emp_name_id"))).sendKeys(empName);
		visibilityOfListElement(driver.findElements(By.xpath(PropertyReader.getProperty("result_list_xpath"))));
		for (WebElement result : driver.findElements(By.xpath(PropertyReader.getProperty("result_list_xpath")))) {
			if (result.getText().equalsIgnoreCase("Jasmine Morgan")) {				
				result.click();
				break;
			}
		}	
		driver.findElement(By.id(PropertyReader.getProperty("dropdown_leavetype_id"))).click();
		Select select = new Select(driver.findElement(By.id(PropertyReader.getProperty("dropdown_leavetype_id"))));
		select.selectByVisibleText(leaveType);	
		sleep(1000);
		balanceText=driver.findElement(By.id(PropertyReader.getProperty("balance_id"))).getText();
		System.out.println("current balance is"+balanceText);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.id(PropertyReader.getProperty("fromDate_id"))));
		driver.findElement(By.id(PropertyReader.getProperty("fromDate_id"))).clear();
		driver.findElement(By.id(PropertyReader.getProperty("fromDate_id"))).sendKeys(fromDate);	
		sleep(1000);
		js.executeScript("arguments[0].click();", driver.findElement(By.id(PropertyReader.getProperty("toDate_id"))));
		driver.findElement(By.id(PropertyReader.getProperty("toDate_id"))).clear();
		driver.findElement(By.id(PropertyReader.getProperty("toDate_id"))).sendKeys(toDate);		
		driver.findElement(By.id(PropertyReader.getProperty("comment_textbox_id"))).sendKeys(comment);
		
		
	}
	
	public static void submitLeave() {
		sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		js.executeScript("arguments[0].click();", driver.findElement(By.id(PropertyReader.getProperty("assign_btn_id"))));
		visibilityOfElement(driver.findElement(By.id(PropertyReader.getProperty("popup_id"))));
		Assert.assertTrue(driver.findElement(By.id(PropertyReader.getProperty("popup_id"))).isDisplayed());
		driver.findElement(By.id(PropertyReader.getProperty("ok_btn_id"))).click();
	}
	
	public static void assignLeaveSucessCheck() {
		sleep(2000);
		String updatedBalance=driver.findElement(By.id(PropertyReader.getProperty("balance_id"))).getText();
		System.out.println("Updated balance is "+updatedBalance);
		Assert.assertNotEquals(updatedBalance, balanceText);
		
	}
}
             