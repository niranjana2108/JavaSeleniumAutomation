package seleniumDayFour.xpathFunctions;

import seleniumDayFour.driverInfo.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends BaseDriver {
	
	public void openURL(){
		driver.get("https://demoqa.com/text-box");
	}
	
	
	public void getName() throws InterruptedException{
		
		WebElement name = 
				
				driver.findElement(By.xpath("//input[@id='userName']"));
				
		driver.findElement(By.className("mr-sm-2 form-control"));
		driver.findElement(By.name("gender"));
		driver.findElement(By.id("firstName"));
		
		driver.findElement(By.linkText("Created"));
		driver.findElement(By.partialLinkText("Crea"));
		
		driver.findElement(By.tagName(null));
		
		
		
	}

}
