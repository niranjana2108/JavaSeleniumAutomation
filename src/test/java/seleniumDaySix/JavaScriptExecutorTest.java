package seleniumDaySix;

import org.testng.annotations.Test;

import seleniumDaySix.javascriptExecutorExample.JavaScriptExecutorExample;

public class JavaScriptExecutorTest {
	JavaScriptExecutorExample jee = new JavaScriptExecutorExample();
  @Test
  public void validateExecuteScript() {
	  jee.openURL();
	  jee.validateClick();
	  jee.validateScroll();
	  
  }
}
