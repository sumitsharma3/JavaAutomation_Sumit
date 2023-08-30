package Wait_IN_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollToView {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver ;
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			WebElement position = driver.findElement(By.xpath("//a[contains(text(),'Position')]"));
			
			JavascriptExecutor  jsExecutor = (JavascriptExecutor) driver ;
			
			
			jsExecutor.executeScript("arguments[0].scrollIntoView();", position);
			
			Thread.sleep(10000);
			driver.quit();

			
		}
	
}
