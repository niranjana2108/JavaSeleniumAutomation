package seleniumDayFive;

import org.testng.annotations.Test;


import seleniumDayFive.waitExample.WaitValidation;

public class WaitTest {
	WaitValidation waitValidation = new WaitValidation();
  @Test
  public void waitTest() throws InterruptedException {
	  waitValidation.openURL();
	  waitValidation.validateWait();
	  
  }
  
  @Test
  public void waitImplicitTest() throws InterruptedException {
	  waitValidation.validateImplicitWait();
	  
  }
}
