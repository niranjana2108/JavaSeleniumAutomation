package seleniumDayFour.xpathFunctions;

import seleniumDayFour.driverInfo.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPath extends BaseDriver {
	
	public void openURL(){
		driver.get("https://demoqa.com/text-box");
	}
	
	
	public void getName() throws InterruptedException{
		
		WebElement name = 
				
				driver.findElement(By.xpath("//input[@id='userName']"));
		driver.findElement(By.xpath("//*[@id='userName']"));
		driver.findElement(By.xpath("//input[@class='']"));
		driver.findElement(By.xpath("//input[text()='']"));
		
		driver.findElement(By.xpath("//input[contains(@id,'')]"));
		
		driver.findElement(By.xpath("//input[starts-with(@class,'')]"));

		
		
		
		
	}

}
