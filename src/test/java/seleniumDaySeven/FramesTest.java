package seleniumDaySeven;

import org.testng.annotations.Test;

import seleniumDaySeven.framesExample.FramesValidation;

public class FramesTest {
	FramesValidation framesValidation = new FramesValidation();
  @Test
  public void frameTest() {
	  framesValidation.openURL();
	  framesValidation.getFrames();
	  
  }
}
