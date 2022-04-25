package week5.day1.assignment;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class EditLead extends BaseClass 
{

	@Test
	public void editLead() 
	{

		// Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

		// Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter CompanyName Field Using id Locator
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

		// Click on edit button
		driver.findElement(By.linkText("Edit")).click();

		// Clear the Description Field using .clear()
		driver.findElement(By.id("updateLeadForm_description")).clear();

		// Fill ImportantNote Field with Any text
		driver.findElement(By.name("importantNote")).sendKeys("Important Note Details");

		// Click on update button
		driver.findElement(By.name("submitButton")).click();

		// Get the Title of Resulting Page
		String title = driver.getTitle();

		// print the page
		System.out.println(title);

		// compare titles
		if (driver.getTitle().equals("View Lead | opentaps CRM")) 
		{
			// print test passed if titles are same
			System.out.println("Test Passed");
		} 
		else 
		{
			// else print test failed
			System.out.println("Test Failed");
		}

	}

}
