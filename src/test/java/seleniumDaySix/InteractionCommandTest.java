package seleniumDaySix;

import org.testng.annotations.Test;

import seleniumDaySix.interactionCommands.InteractionCommands;


public class InteractionCommandTest {
	InteractionCommands interactionCommands = new InteractionCommands();
	

  
  @Test
  public void validateInteractions() throws Exception {
	  interactionCommands.openURL();
	  
	  interactionCommands.interactionCommands();
  }
}
