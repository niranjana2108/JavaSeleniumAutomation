package seleniumDayFour.xpathFunctions;

import seleniumDayFour.driverInfo.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPathFunctions extends BaseDriver {
	
	public void openURL(){
		driver.get("https://demoqa.com/text-box");
	}
	
	
	public void getName() throws InterruptedException{
		
		WebElement name = driver.findElement(By.xpath("//input[@id='userName']"));
		//form[@id='userForm']//following::input
		//form[@id='userForm']//following::input[2]
		
		//input[@id='userName']//ancestor::div
		//input[@id='userName']//parent::div
		
		//form[@id='userForm']//child::label
		
		//div[@id='userName-wrapper']//preceding::div
		
		//div[@id='userName-wrapper']//following-sibling::div
		
		//div[@id='userName-wrapper']//descendant::div
		
		
		
		
	}

}
