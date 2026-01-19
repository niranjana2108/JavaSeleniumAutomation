package seleniumDayThreeTestNG.reporting;

import org.testng.annotations.Test;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class DataProviderReportingExample {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  Reporter.log("this is added as a report");
	  System.out.println("Integer is "+n);
	  System.out.println("String is "+s);
	 
	  Assert.assertTrue(false);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" }
     };
  }
  
}