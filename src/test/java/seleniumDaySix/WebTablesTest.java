package seleniumDaySix;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import seleniumDaySix.webTableExample.WebTableExample;

import org.testng.annotations.Test;

public class WebTablesTest {
	WebTableExample webTableExample = new WebTableExample();
  @Test
  public void validateExecuteScript() {
	  webTableExample.openURL();
	  webTableExample.validateTable();
	 
  }
}
