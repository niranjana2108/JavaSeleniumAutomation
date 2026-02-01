package seleniumDayEight.seleniumUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumDayFour.driverInfo.BaseDriver;

public class RegisterPage extends SeleniumFunctions {
	
	By firstNameTextbox = By.xpath("//label[text()='Full Name']/following-sibling::input");
	

	public void openApplication() {
		openURL("https://app.ippopay.com/signup");
	}
		
	public void setFirstNameField() {
		sendkeysFunction(firstNameTextbox, "testdata");
	}
	
	
}
