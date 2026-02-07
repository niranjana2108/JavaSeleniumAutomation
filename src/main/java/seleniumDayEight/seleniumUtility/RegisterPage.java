package seleniumDayEight.seleniumUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumDayFour.driverInfo.BaseDriver;

public class RegisterPage extends SeleniumFunctions {
	
	By userNameTextbox = By.xpath("//input[@name='username']");
	By passwordTextbox = By.xpath("//input[@name='password']");
	By loginButton = By.xpath("//input[@value='Log In']");
	By message = By.xpath("//p[@class='error']");


	public void openApplication() {
		openURL("https://parabank.parasoft.com/parabank/index.htm");
	}
		
	public String login(String userName,String pwd) {
		sendkeysFunction(userNameTextbox, userName);
		sendkeysFunction(passwordTextbox, pwd);
		driver.findElement(loginButton).click();
		return driver.findElement(message).getText();
	}

	public void closeApplication() {
		driver.quit();
	}
	
}
