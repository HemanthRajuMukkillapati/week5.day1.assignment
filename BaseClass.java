package week5.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	//removed static because its not working with Parallel execution as only one instance created
	public ChromeDriver driver;
	
	@BeforeMethod
	public void login() {
		WebDriverManager.chromedriver().setup();//setup driver--static
		
		//launch the browser
		
		driver=new ChromeDriver(); 	
		
		//Load the URl (get)--string input so in double quotes 	
		driver.get("http://leaftaps.com/opentaps");
		//maximize the window
		driver.manage().window().maximize();
		
		//enter user name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on submit button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//print title
		String title = driver.getTitle();
		System.out.println(title);
		
		//click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}

}


