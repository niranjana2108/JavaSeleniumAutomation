package seleniumDayFour;

import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumDayFour.browserControlCommands.BrowserControlCommands;
import seleniumDayFour.navigationCommands.NavigationCommands;

public class NavigationBrowserCommandTest {
	NavigationCommands navigationCommands = new NavigationCommands();
	BrowserControlCommands browserControlCommands= new BrowserControlCommands();
	
  @Test(enabled = true)
  public void navigationCommandTest() throws InterruptedException {
	  navigationCommands.openURL();
	  Thread.sleep(3000);
	  navigationCommands.goTo();
	  Thread.sleep(2000);
	  navigationCommands.goBack();
	  Thread.sleep(2000);
	  navigationCommands.goForward();
	  Thread.sleep(2000);
	  navigationCommands.refresh();
  }
  
  @Test
  public void browserCommandTest() throws InterruptedException {
	  browserControlCommands.openURL();
	  System.out.println(browserControlCommands.getCurrentURL()); //https://demoqa.com/text-box
	  System.out.println(browserControlCommands.getTitle());
	  System.out.println(browserControlCommands.getPageSource());
	  
	 Assert.assertEquals(browserControlCommands.getTitle(), "ToolsQA","failed");
	 browserControlCommands.quit();
	  
  }
}
