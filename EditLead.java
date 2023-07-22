package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead 
{
			public static void main(String[] args) 
			{
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SHEELA");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("NAREN");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("B");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing the Create Leads");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bsheela.gce@gmail.com");
				WebElement drop = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select op = new Select(drop);
				op.selectByValue("NY");
				driver.findElement(By.name("submitButton")).click();
				driver.findElement(By.linkText("Edit")).click();
				driver.findElement(By.id("updateLeadForm_description")).clear();
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Edit and then update the note");
				driver.findElement(By.className("smallSubmit")).click();
				
	}

}
