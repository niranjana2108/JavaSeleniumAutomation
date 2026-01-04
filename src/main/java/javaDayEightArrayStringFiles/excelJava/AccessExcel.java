package javaDayEightArrayStringFiles.excelJava;

public class AccessExcel {
	
	
	
	public static void main(String[] args) throws Exception {
    	// Declaring the path of the Excel file with the name of the Excel file
    	
		ExcelData.setExcelFile("D:\\Niranjana_Class\\IntelliJSamples\\JavaSeleniumAutomation\\src\\test\\res\\ExternalFiles\\testData.xlsx", "testSheet");
    	//Hard coded values are used for Excel row & columns for now
    	//In later chapters we will replace these hard coded values with varibales
    	//This is the loop for reading the values of the column 3 (Action Keyword) row by row
    	for (int iRow=1;iRow<=4;iRow++){
		    //Storing the value of excel cell in sActionKeyword string variable
    		String username = ExcelData.getCellData(iRow, 0);
    		String password = ExcelData.getCellData(iRow, 1);
    		System.out.println(username);
    		System.out.println(password);
    	}
	}
 

}
