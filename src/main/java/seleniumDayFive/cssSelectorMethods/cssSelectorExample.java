package seleniumDayFive.cssSelectorMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumDayFour.driverInfo.BaseDriver;

public class cssSelectorExample extends BaseDriver {
	
		
	
	public void cssExample() {
		WebElement name = 
				
				driver.findElement(By.xpath("//input[@id='userName']"));
		
		
		driver.findElement(By.xpath("//input[text()='userName']")).click();
		
		
		driver.findElement(By.cssSelector("input#userName"));
		driver.findElement(By.cssSelector("input.className"));
		driver.findElement(By.cssSelector("input[id='userName']"));
		
		
		driver.findElement(By.cssSelector("input[id^='use']"));
		
		driver.findElement(By.cssSelector("input[id$='Name']"));
		
		driver.findElement(By.cssSelector("input[id*='erNa']"));
		
		driver.findElement(By.cssSelector("input:contains(userName)"));
			
	}
	
	
}
