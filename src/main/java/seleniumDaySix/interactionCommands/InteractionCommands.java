package seleniumDaySix.interactionCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import seleniumDayFour.driverInfo.BaseDriver;

public class InteractionCommands extends BaseDriver {
	
	public void openURL(){
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/login-form.html");
	}
	
	
	
	
	public void interactionCommands() throws Exception {
		
		driver.findElement(By.id("username")).sendKeys("test");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.xpath("//button[text()='Submit']")).submit();
		
	}

}
