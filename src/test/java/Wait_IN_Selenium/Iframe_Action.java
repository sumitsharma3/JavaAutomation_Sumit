package Wait_IN_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_Action {
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver ;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement demo_frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(demo_frame);
		driver.findElement(By.xpath("//label[@for = 'radio-1']")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
