package seleniumDayEight.seleniumUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumDayFour.driverInfo.BaseDriver;

public class HomePage extends SeleniumFunctions {
	
	By signUpButton = By.xpath("//div[@class='header-fluid']//span[text()='Sign up']");
	
	
	public void openApplication() {
		logger.info("test");
		openURL("https://www.ippopay.com/");
	}
		
	public void clickSignUpButton() {
		clickFunction(signUpButton);
	}
	
	
}
