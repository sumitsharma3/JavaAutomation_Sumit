package Wait_IN_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Wait_Script {
	
	WebDriver driver ;
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/implicit-wait-example");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	
		
		
	}
	@Test
	public void CheckBox() throws InterruptedException {
			
		driver.findElement(By.xpath("//div[@id='q']/input[1]")).click();
		driver.findElement(By.xpath("//div[@id='q']/input[2]")).click();
		driver.findElement(By.xpath("//div[@id='q']/input[3]")).click();
		driver.findElement(By.xpath("//div[@id='q']/input[4]")).click();
		driver.findElement(By.xpath("//div[@id='q']/input[5]")).click();
		Thread.sleep(12000);
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
		
	}
	


}
