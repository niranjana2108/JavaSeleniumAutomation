package seleniumDaySix;

import org.testng.annotations.Test;

import seleniumDaySix.dynamicDropdown.DynamicDropdown;

public class DynamicDropdownTest {
	DynamicDropdown dynamicDropdown = new DynamicDropdown();
	
	
  @Test
  public void dropdownValidationOneTest() throws Exception {
	  dynamicDropdown.openURL();
	  dynamicDropdown.dropdownValidationOne();
  }
  
  @Test
  public void dropdownValidationTwoTest() throws Exception {
	  dynamicDropdown.dropdownValidationTwo();
  }
 
}
