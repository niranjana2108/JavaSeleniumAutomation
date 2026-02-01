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

public class DragAndDrop extends BaseDriver {
	
	public void openURL(){
		
		driver.get("https://demoqa.com/droppable/");
	}
	
	
	public void validateDragAndDrop() throws InterruptedException {
		Actions builder = new Actions(driver);
		 
		 WebElement from = driver.findElement(By.id("draggable"));
		 
		 WebElement to = driver.findElement(By.id("droppable")); 
		 Thread.sleep(3000);
		 //Perform drag and drop
		 builder.dragAndDrop(from, to).perform();
		 
		 //verify text changed in to 'Drop here' box 
		 String textTo = to.getText();
		 
		 if(textTo.equals("Dropped!")) {
		 System.out.println("PASS: Source is dropped to target as expected");
		 }else {
		 System.out.println("FAIL: Source couldn't be dropped to target as expected");
		 }
		
	  
	}

}
