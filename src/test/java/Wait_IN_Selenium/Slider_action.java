package Wait_IN_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider_action {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver ;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		
		WebElement  demo_frame = driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
		
		driver.switchTo().frame(demo_frame);
		
		WebElement slider = driver.findElement(By.xpath("//div[@id = 'slider']/span"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(slider).moveByOffset(200, 0).release().perform();
		Thread.sleep(2000);
		
		action.dragAndDropBy(slider, -200, 0).perform();
		
		//trying the slider by getting the width of the span
		
		Dimension divsize = slider.getSize();
		
		int divwidth = divsize.getWidth();
		
		action.dragAndDropBy(slider, divwidth/2 , 0).perform();
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	}

}
