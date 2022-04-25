package week5.day1.assignment;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateContact extends BaseClass 
{
	// this will not execute as we have set enabled=false
	@Test(enabled = false)
	public void createContact() 
	{
		//click on contacts
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		//click on create contact
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		
		//enter first name
		driver.findElement(By.id("firstNameField")).sendKeys("TestLeafFirst");
		
		//enter last name
		driver.findElement(By.id("lastNameField")).sendKeys("TestLeaflast");
		
		//enter first name local
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("TestLeafFirstLocal");
		
		//enter lastname local
		driver.findElement(By.xpath("//input[@name='lastNameLocal']")).sendKeys("TestLeafLastLocal");
		
		//enter department name
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Testdepartment");
		
		//enter contact desc
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("TestDesc");
		
		//enter prim email
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']"))
				.sendKeys("testleafhetty@testleaf.com");
		
		//create a variable for web element for stateProvince
		WebElement stateprovdd = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		
		//create a object for select class
		Select stPvDd = new Select(stateprovdd);
		
		//select newyork
		stPvDd.selectByVisibleText("New York");

		//click create contact
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();

		//click on edit
		driver.findElement(By.xpath("//a[text()='Edit'] ")).click();
		
		//update contact desc
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		
		//click on update button
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		//get the title of page
		String titleOfPage = driver.getTitle();

		//print the page
		System.out.println("the Title of the page is:  " + titleOfPage);

	}

}
