package seleniumDaySeven.actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumDayFour.driverInfo.BaseDriver;

public class ToolTips extends BaseDriver {
	
	public void openURL(){
		
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
	}
	
	
	public void validateToolTip() throws InterruptedException {
		Actions actions = new Actions(driver); 
		 
		 //Retrieve WebElement 
		 WebElement element = driver.findElement(By.id("toolTipButton"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		 
		 // Use action class to mouse hover 
		 actions.moveToElement(element).perform();
		 Thread.sleep(5000);
		 WebElement toolTip = driver.findElement(By.id("buttonToolTip"));
		 
		 // To get the tool tip text and assert 
		 String toolTipText = toolTip.getText();
//		 String toolTipText = element.getAttribute("aria-describedby");
		 System.out.println("toolTipText-->"+toolTipText);
	}
}
