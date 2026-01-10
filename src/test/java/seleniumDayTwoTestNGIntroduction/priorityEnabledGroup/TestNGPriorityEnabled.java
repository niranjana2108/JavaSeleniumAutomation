package seleniumDayTwoTestNGIntroduction.priorityEnabledGroup;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPriorityEnabled {
	
  @Test(enabled = true,priority = 1)
  public void testOne() {

	  Assert.assertEquals(1, 0);

	}
  
  @Test(priority = 1)
  public void testTwo() {

	  Assert.assertEquals(1, 1);

	}
  
  @Test(priority = 0)
  public void testThree() {
	  

	  Assert.assertEquals(1, 1);

	}
  
  @Test(priority = -1)
  public void testFour() {

	  Assert.assertEquals(1, 1);

	}
  
  @Test(priority = 2)
  public void testFive() {

	  Assert.assertEquals(1, 1);

	}
  
  @Test(enabled = false)
  public void testSix() {

	  Assert.assertEquals(1, 1);

	}
  
  @Test(enabled = true)
  public void testSeven() {

	  Assert.assertEquals(1, 1);

	}

}
