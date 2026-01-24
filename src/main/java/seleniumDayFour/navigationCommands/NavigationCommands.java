package seleniumDayFour.navigationCommands;

import seleniumDayFour.driverInfo.BaseDriver;

public class NavigationCommands extends BaseDriver {
	
	public void openURL(){
		driver.get("https://demoqa.com/text-box");
	}
	
	
	public void goBack() {
		driver.navigate().back();
	}
	
	public void goForward() {
		driver.navigate().forward();
	}
	
	public void refresh() {
		
		driver.navigate().refresh();
		
	}

	public void goTo() {
		
		driver.navigate().to("https://www.google.co.in/");
		
	}
	

}
