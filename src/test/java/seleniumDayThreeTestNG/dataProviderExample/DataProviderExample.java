package seleniumDayThreeTestNG.dataProviderExample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderExample {
  @Test(dataProvider = "dp")
  public void func(Integer n, String s) {
    Assert.assertEquals(1,n);
	  System.out.println(n+" "+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
