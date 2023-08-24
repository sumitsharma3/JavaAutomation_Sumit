package Wait_IN_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver ;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Downloads/Practice.html");
		
		WebElement mousehover = driver.findElement(By.xpath("//button[@id = 'mousehover']"));
		WebElement reload = driver.findElement(By.xpath("//a[contains( text(), 'Reload')]"));
		
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		action.moveToElement(mousehover).moveToElement(reload).click().perform();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
