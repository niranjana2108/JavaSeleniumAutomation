package seleniumDaySeven.actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumDayFour.driverInfo.BaseDriver;

public class Slider extends BaseDriver {
	
	public void openURL(){
		
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
	}
	
	
	public void validateSlider() throws InterruptedException{
		
		
	    Actions action = new Actions(driver);
	 
	    WebElement sliderElement = driver.findElement(By.name("my-range"));
	  
	    
	    
	    action.click(sliderElement).build().perform();
	    Thread.sleep(1000);
	    for (int i = 0; i < 3; i++) 
	    {
	        action.sendKeys(Keys.ARROW_LEFT).build().perform();
	        Thread.sleep(200);
	    }
	    
	    action.clickAndHold(sliderElement).build().perform();
	    action.moveByOffset(0,80);
	    action.release().build();
	 
	   
	}

}
