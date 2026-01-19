package seleniumDayThreeTestNG.dataProviderExample;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s, Integer n1) {
	  
	  int a[][] = new int[2][2];
	  a[0][0]=1;
	  a[0][1]=2;
	  a[1][0]=3;	
	  
	  System.out.println(n +" "+s+ " "+n1);
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a",8 },
      new Object[] { 2, "b",9 },
    };
  }
  
  @DataProvider
  public Object[][] dp2() {
    return new Object[][] {
    	
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
   
    };
  }
}
