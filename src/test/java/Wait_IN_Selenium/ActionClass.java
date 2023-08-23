package Wait_IN_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver ;
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				WebElement rome_Drag = driver.findElement(By.id("box6"));
				WebElement italy_drop = driver.findElement(By.id("box106"));
				
				Actions action = new Actions(driver);	
				
				action.dragAndDrop(rome_Drag, italy_drop).perform();
				
				Thread.sleep(5000);
				driver.quit();
				
			}

	
}
