package Wait_IN_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickFunction {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver ;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement iframeResult = driver.findElement(By.xpath("//iframe[@id = 'iframeResult']"));
		
		driver.switchTo().frame(iframeResult);
		
		WebElement paragraph = driver.findElement(By.xpath("//p[contains(text(),'Double-click this paragraph to trigger a function.')]"));
		
		Actions action = new Actions(driver);
		
		action.doubleClick(paragraph).perform();
		
		Thread.sleep(2000);
		action.contextClick(paragraph).perform();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
