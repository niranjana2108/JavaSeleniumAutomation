package seleniumDayThreeTestNG;




public class DataMapper  {
	
					
			public Object[][] dataMapperFunction() throws Exception {
						ExcelRetrive.setExcelFile("D:\\Niranjana_Class\\Automation Testing Session\\Selenium Sample\\TestNGDayTwo\\src\\test\\resources\\testdata.xlsx", "Sheet1");
						return ExcelRetrive.getExcelData();
			}
		
	 
	 
	 
	

}
