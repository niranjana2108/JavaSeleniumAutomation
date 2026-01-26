package seleniumDayFive.validationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import seleniumDayFour.driverInfo.BaseDriver;

public class ValidationCommands extends BaseDriver {
	
	public void openURL(){
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
	}
	
	
	public void validateCommands() {
		
		WebElement sampleText = driver.findElement(By.className("display-6"));
		//use it only if text is in between tags
		System.out.println("Text is "+ sampleText.getText());
		System.out.println(sampleText.isDisplayed());
		
		
		WebElement checkedRadioButton = driver.findElement(By.id("my-radio-1"));
		
		//use it to get value of attributes
		System.out.println("Value is "+ checkedRadioButton.getAttribute("class"));
		System.out.println("Value is "+ checkedRadioButton.getAttribute("type"));
		
		
		WebElement defaultRadioButton = driver.findElement(By.id("my-radio-2"));
				
		System.out.println(defaultRadioButton.isEnabled());//true
		System.out.println(defaultRadioButton.isSelected());//false
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", defaultRadioButton);
		//impressiveRadioButton.click();
		
		
		System.out.println(defaultRadioButton.isSelected());//true
		
		WebElement disabledTextbox = driver.findElement(By.name("my-disabled"));
		System.out.println(disabledTextbox.isEnabled());//false

		driver.quit();
		
		
	}
	
	
}
