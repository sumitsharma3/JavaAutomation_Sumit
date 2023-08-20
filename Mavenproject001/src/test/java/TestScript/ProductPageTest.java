package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductPageTest {
	WebDriver driver;
	
	@BeforeMethod
public void setup() {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
		
		
	}
	
@Test
	public void Product_Test_case01() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");	
		driver.findElement(By.cssSelector("#login-button")).click();
		
		
	}
	@Test
public void Product_Test_case02() {
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");	
	driver.findElement(By.cssSelector("#login-button")).click();
		
		
	}
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
		
	}

}