package seleniumDayFour;

import org.testng.annotations.Test;

import seleniumDayFour.practisePages.TextBoxValidation;


public class LocatorsExample {
	TextBoxValidation obj = new TextBoxValidation();
	
	@Test
	public void chromeValidation() throws InterruptedException {
		obj.openURL();
		obj.webElementAction();
		
	}

}
