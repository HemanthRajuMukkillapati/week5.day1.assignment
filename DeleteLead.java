package week5.day1.assignment;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class DeleteLead extends BaseClass {

	@Test
	public void deleteLead() throws InterruptedException {

		// Click on Leads Button
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();

		// store Find Leads web element in a variable
		WebElement findLeadLink = driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]"));

		// click on find leads button
		findLeadLink.click();

		// click on phone
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();

		// clear the phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).clear();

		// clear country code
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();

		// store find button web element in a variable
		WebElement findBtn = driver.findElement(By.xpath("//button[contains(text(),'Find')]"));

		// click on find button
		findBtn.click();

		// sleep for 5 seconds
		Thread.sleep(5000);

		// get the first lead id in a variable
		String firstleadID = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/a")).getText();

		// print the first Lead
		System.out.println("The First Lead ID is : " + firstleadID);

		// click on view Lead
		driver.findElement(By.xpath("//table//div[contains(@class,'Id')]/a[contains(@href,'viewLead')]")).click();
		
		Thread.sleep(5000);
		
		// click on delete
		driver.findElement(By.xpath("//div/a[text()='Delete']")).click();

		// giving this to avoid stale element exception
		Thread.sleep(5000);

		// click on find leads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();

		// enter first lead id
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstleadID);

		// click on find
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();

		// sleep to avoid stale
		Thread.sleep(2000);

		// get the text of no records
		String noRecord = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();

		// print the displayed text
		System.out.println(noRecord);

		// compare it with expected text
		if (noRecord.equals("No records to display")) 
		{
			// print test pass if comparison is true
			System.out.println("Test is passed");

		} 
		else 
		{ 
			// print test failed if comparison is false
			System.out.println("Test is failed");
		}
	}
}
