package seleniumDaySeven.actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumDayFour.driverInfo.BaseDriver;

public class RightClick extends BaseDriver {
	
	public void openURL(){
		
		driver.get("https://demoqa.com/buttons");
	}
	
	
	public void validateRightClick() throws InterruptedException{
		
		
	    Actions actions = new Actions(driver);
	 
	    WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
	 	    actions.contextClick(btnElement).perform();
	    System.out.println("Right click displayed");
	 
	   
	}

}
