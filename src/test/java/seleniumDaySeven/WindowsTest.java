package seleniumDaySeven;

import org.testng.annotations.Test;

import seleniumDaySeven.framesExample.FramesValidation;
import seleniumDaySeven.windowsExample.WindowsValidation;

public class WindowsTest {
	WindowsValidation windowsValidation = new WindowsValidation();
  @Test
  public void windowTest() throws InterruptedException {
	  windowsValidation.openURL();
	  windowsValidation.getWindows();
	  
  }
}
