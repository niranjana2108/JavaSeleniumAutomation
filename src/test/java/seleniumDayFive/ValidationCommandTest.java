package seleniumDayFive;

import org.testng.annotations.Test;

import seleniumDayFive.validationCommands.ValidationCommands;

public class ValidationCommandTest {
	ValidationCommands validationCommands = new ValidationCommands();
	
  @Test
  public void validate() throws InterruptedException {
	  validationCommands.openURL();
	  Thread.sleep(2000);
	  validationCommands.validateCommands();
  }
  
 
}
