package seleniumDayFive;

import org.testng.annotations.Test;

import seleniumDayFive.seleniumSelect.SeleniumSelect;

public class SelectTest {
	SeleniumSelect seleniumSelect = new SeleniumSelect();
	
  @Test
  public void selectValidations() throws InterruptedException {
	  seleniumSelect.openURL();
	  seleniumSelect.validateCommands();
  }
}
