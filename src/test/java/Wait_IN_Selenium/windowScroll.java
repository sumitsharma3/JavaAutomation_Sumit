package Wait_IN_Selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowScroll {

	public static void main(String[] args) throws InterruptedException {
			
WebDriver driver ;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver ;
		
		jsExecutor.executeScript("window.scrollBy(0, 500);");
		
		Thread.sleep(5000);
		
		jsExecutor.executeScript("window.scrollBy(0, -500);");
		
		Thread.sleep(2000);
		driver.quit();
		

		
	}

}
