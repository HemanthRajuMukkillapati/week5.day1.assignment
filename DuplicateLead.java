package week5.day1.assignment;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class DuplicateLead extends BaseClass 
{

	// to skip the test case using invocation count 0
	@Test(invocationCount = 0)
	public void duplicateLead() throws InterruptedException 
	{

		// Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

		// Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter CompanyName Field Using id Locator and using as variable since in
		// Duplicate page also same id.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hety's Org");

		// Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hemanth1");

		// Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raju1");

		// Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("local");

		// Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");

		// Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Assignment");

		// Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hemanthraju.m1991@gmail.com");

		// Select State/Province as NewYork Using Visible Text
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		// Select State/Province as NewYork Using Visible Text
		Select spDD = new Select(stateProvince);

		spDD.selectByVisibleText("New York");

		// Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();

		// get title
		String title = driver.getTitle();

		// print title
		System.out.println(title);

		// click on Duplicate
		driver.findElement(By.linkText("Duplicate Lead")).click();

		// company name element in an variable
		WebElement compnayName = driver.findElement(By.id("createLeadForm_companyName"));

		// clear existing company name
		compnayName.clear();

		// update companyname variable
		String updateComp = "company updated to new";

		// update company name to new name
		compnayName.sendKeys(updateComp);

		// update First name variable
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));

		// clear existing first name
		firstName.clear();

		// update with a new name
		firstName.sendKeys("UpdatedName");

		// click on submit button
		driver.findElement(By.className("smallSubmit")).click();

		// get page title
		String titleupdated = driver.getTitle();// get title

		// Print duplicate page title
		System.out.println("The page after creating duplicate details title:  " + titleupdated);

		// compare titles
		if (driver.getTitle().equals("View Lead | opentaps CRM")) {

			// both are equal print test pass
			System.out.println("Test Passed");
		} 
		else 
		{
			// else print test fail
			System.out.println("Test Failed");
		}

	}

}
