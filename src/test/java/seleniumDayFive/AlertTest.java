package seleniumDayFive;

import org.testng.annotations.Test;

import seleniumDayFive.seleniumAlerts.SeleniumAlerts;

public class AlertTest {
	SeleniumAlerts seleniumAlerts = new SeleniumAlerts();
	
  @Test(enabled = true)
  public void simpleAlert() throws InterruptedException {
	  seleniumAlerts.openURL();
	  seleniumAlerts.simpleAlert();
  }
  
  @Test(enabled = true)
  public void confirmAlert() throws InterruptedException {
	  seleniumAlerts.openURL();
	  seleniumAlerts.acceptDismissAlert();
  }
  
  @Test(enabled = true)
  public void promptAlert() throws InterruptedException {
	  seleniumAlerts.openURL();
	  seleniumAlerts.promptAlert();
  }
}
