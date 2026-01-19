package seleniumDayThreeTestNG.dataProviderExample;

import org.testng.annotations.Test;

import seleniumDayThreeTestNG.DataMapper;

import org.testng.annotations.DataProvider;

public class DataProviderWithExcel {
	
	DataMapper dataMapper = new DataMapper();
	
  @Test(dataProvider = "dp")
  public void testMethod(String operand1,String operand2,String operator) {
	  System.out.println(operand1+" "+operand2+" "+operator);
  }

  @DataProvider
  public Object[][] dp() throws Exception {
	  Object[][]  arrayObject = dataMapper.dataMapperFunction();
		return arrayObject;
  }
}
