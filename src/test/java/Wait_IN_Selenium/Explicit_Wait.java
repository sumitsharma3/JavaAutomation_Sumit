package Wait_IN_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_Wait {
	
WebDriver driver ;
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/implicit-wait-example");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(12));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='q']/input[1]")));
		
	}
	@Test
	public void CheckBox() throws InterruptedException {
			
		driver.findElement(By.xpath("//div[@id='q']/input[1]")).click();
		Thread.sleep(5000);

	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
		
	}


}
