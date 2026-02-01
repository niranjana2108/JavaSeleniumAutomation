package seleniumDaySix.javascriptExecutorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import seleniumDayFour.driverInfo.BaseDriver;

public class JavaScriptExecutorExample extends BaseDriver {
	
	public void openURL(){
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
	}
	
	public void validateClick() {
		WebElement defaultRadioButton = driver.findElement(By.id("my-radio-2"));
			
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", defaultRadioButton);

	}
	
	public void validateScroll() {
			//simple scroll
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
		//scroll for element
		WebElement InteractionsElement = driver.findElement(By.xpath("//div[@class='form-group tp-align-right mt-3']/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", InteractionsElement);
	}
	
	
		


}
