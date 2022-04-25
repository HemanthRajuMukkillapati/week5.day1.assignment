package week5.day1.assignment;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class CreateLead extends BaseClass {
	//this will execute twice since invocationCount=2
	@Test(invocationCount = 2)
	public void createLead() {
		// click on Leads
		driver.findElement(By.linkText("Leads")).click();
		
		//click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//createLeadForm_companyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hety's Org");
		
		//createLeadForm_firstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hemanth1");
		
		//createLeadForm_lastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raju1");

		//click in source drop-down
		WebElement elesource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//object for Select class  
		Select sourcedd = new Select(elesource);
		
		//select by visible text 'Employee'
		sourcedd.selectByVisibleText("Employee");
			
		//click on Create lead
		driver.findElement(By.className("smallSubmit")).click();
		
		//verify source drop down value
		String verifySourcevalue=driver.findElement(By.id("viewLead_dataSources_sp")).getText();
		
		//print source drop down value
		System.out.println(verifySourcevalue);
		
		//get the page title and print
		System.out.println(driver.getTitle());

	}

}
