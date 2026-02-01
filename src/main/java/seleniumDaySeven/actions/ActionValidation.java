package seleniumDaySeven.actions;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumDayFour.driverInfo.BaseDriver;

public class ActionValidation extends BaseDriver {
	
	public void openURL(){
		
		driver.get("https://demoqa.com/text-box");
	}
	
	
	public void validateKeyboardActions() throws InterruptedException{
		
		  Actions actions = new Actions(driver);
		 WebElement currentAddress=driver.findElement(By.id("currentAddress"));
	        currentAddress.sendKeys("No.45, ABC street, XYZ Nagar");
	        
	       
	        // Select the Current Address using CTRL + A
	        actions.keyDown(Keys.CONTROL)
	        .sendKeys("a")
	        .keyUp(Keys.CONTROL)
	        .build()
	        .perform();
	        
	        // Copy the Current Address using CTRL + C
	        actions.keyDown(Keys.CONTROL);
	        actions.sendKeys("c");
	        actions.keyUp(Keys.CONTROL);
	        actions.build().perform();
	        
	        //Press the TAB Key to Switch Focus to Permanent Address
	        actions.sendKeys(Keys.TAB);
	        actions.build().perform();
	        
	        //Paste the Address in the Permanent Address field using CTRL + V
	        actions.keyDown(Keys.CONTROL);
	        actions.sendKeys("v");
	        actions.keyUp(Keys.CONTROL);
	        actions.build().perform();
		
	}

}
