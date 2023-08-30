package Wait_IN_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

		WebDriver driver ;
		@BeforeMethod
		public void setup() {

		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		}
		
		@Test
		public void Date_pick_Test() throws InterruptedException {
			
			WebElement demo_frame = driver.findElement(By.xpath("//iframe[@class= 'demo-frame']"));
			driver.switchTo().frame(demo_frame);
			
			
			driver.findElement(By.xpath("//input[@id='datepicker']")).click();
			
			String ExpectedDate = "March2021";
			String ActualDate = "";
			String Month = "";
			String Year = "";
			
			Month = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();		
			Year = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
			ActualDate = Month+Year;
			
			while(true) {
				Month = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();		
				Year = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
				ActualDate = Month+Year;
				
				if(ExpectedDate.equalsIgnoreCase(ActualDate)) {
					
					break;
					
				}
				
				driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-circle-triangle-w']")).click();
				
				
			}
			
			driver.findElement(By.xpath("//a[contains(text(),'27')]")).click();
			
			
		}
		
		@AfterMethod
		public void teardown() throws InterruptedException {
			
			Thread.sleep(10000);
			driver.quit();
			
		}
	
	

}
