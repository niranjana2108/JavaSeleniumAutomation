package seleniumDayThreeTestNG.parameterExample;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterExample {
	
  @Test	
  @Parameters({"selenium.host"})
   public void testOne(String data) {
		System.out.println(data);
  }
  @Test
  @Parameters({"selenium.host","selenium.port"})
  public void testTwo(String dataOne,String dataTwo) {
		System.out.println(dataOne+ " "+ dataTwo);
  }
  
  @BeforeMethod
  public void beforeMethod(ITestContext context) {
	  String seleniumHost = context.getCurrentXmlTest().getParameter("selenium.host");
	  String seleniumPort = context.getCurrentXmlTest().getParameter("selenium.port");
	  String seleniumBrowser = context.getCurrentXmlTest().getParameter("selenium.browser");
	  System.out.println("I am in beforemethod "+seleniumHost);

	  
  }
}
