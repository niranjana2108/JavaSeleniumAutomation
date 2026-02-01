package seleniumDayEight.seleniumUtility;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import seleniumDayFour.driverInfo.BaseDriver;

public class SeleniumFunctions extends BaseDriver {
	Logger logger = LogManager.getLogger(SeleniumFunctions.class);
	
	public void openURL(String url){
		logger.debug("open url");
		driver.get(url);
	}
	
	public void clickFunction(By element) {
		logger.debug("click function entered");
		driver.findElement(element).click();
	}	
	
	public void sendkeysFunction(By element,String data) {
		logger.debug("send text data");
		driver.findElement(element).sendKeys(data);
	}
	
	public String getTextFunction(By element) {
		logger.debug("getvalue function");
		return driver.findElement(element).getText();
	}
	
	public void selectDropdownFunction(By element,String operator) {
		logger.debug("selectDropdown function entered");
		Select dropdown = new Select(driver.findElement(element));
		dropdown.selectByVisibleText(operator);
		
	}
	
	public void closeBrowser() {
		logger.debug("closeBrowser function entered");
		driver.quit();
		
	}
	
	public void seleniumWait() {
		logger.debug("seleniumWait function entered");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	

}
