package seleniumDayFour.browserControlCommands;

import seleniumDayFour.driverInfo.BaseDriver;

public class BrowserControlCommands extends BaseDriver {
	
	public void openURL(){
		driver.get("https://demoqa.com/text-box");
	}
	
	
	public String getCurrentURL() {
		
		return driver.getCurrentUrl();
		
	}
	
	public String getTitle() {
		
		return driver.getTitle();
		
	}

	public String getPageSource() {
		
		return driver.getPageSource();
		
	}
	
	public void close() {
		
		driver.close();
		
	}
	
	public void quit() {
		
		driver.close();
		
	}
}
