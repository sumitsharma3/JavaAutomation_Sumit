package Wait_IN_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver ;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/autocomplete/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement demo_frame = driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
		
		driver.switchTo().frame(demo_frame);
		
		WebElement tag = driver.findElement(By.xpath("//input[@id='tags']"));
		tag.sendKeys("A");
		
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		for(WebElement autoSuggestion : autoSuggestions) 
		{		
			
			String option = autoSuggestion.getText();
			
			if(option.equalsIgnoreCase("Basic")) 
			{
				autoSuggestion.click();
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
