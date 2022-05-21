package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("JJCo");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("JPratyush");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("JJitesh");
						
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is my first testing selenium script");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jenita.jawaharlal@gmail.com");
		
		WebElement eleObj =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select SO = new Select(eleObj);
		SO.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();  
		Thread.sleep(2000);

		driver.findElement(By.id("updateLeadForm_description")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important info to be considered");
		Thread.sleep(2000);
        driver.findElement(By.className("smallSubmit")).click();
        
       System.out.println(driver.getTitle());

	}

}
