package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver ;
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	}
	@Test
	public void Login_Test_case01() {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");	
		driver.findElement(By.cssSelector("#login-button")).click();
		
		
		
	}
@Test	
public void Login_Test_case02() {
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");	
	driver.findElement(By.cssSelector("#login-button")).click();
		
	}
@Test	
public void Login_Test_case03() {
	driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");	
	driver.findElement(By.cssSelector("#login-button")).click();
		
	}


@AfterMethod
public void TearDown() {
	
	driver.quit();
	
}
	
}
