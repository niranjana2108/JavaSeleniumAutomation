package javaDayEightArrayStringFiles.excelJava;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

    private static Workbook workbook;
    private static Sheet sheet;
    private static DataFormatter formatter = new DataFormatter();

//This method is to set the File path and to open the Excel file
//Pass Excel Path and SheetName as Arguments to this method
public static void setExcelFile(String Path,String SheetName) throws Exception    {
        FileInputStream ExcelFile = new FileInputStream(Path);
        workbook = new XSSFWorkbook(ExcelFile);
        sheet = workbook.getSheet(SheetName);
       }

//This method is to read the test data from the Excel cell
//In this we are passing parameters/arguments as Row Num and Col Num
    public static String getCellData(int RowNum, int ColNum) throws Exception{
	  Cell cell = sheet.getRow(RowNum).getCell(ColNum);
      String CellData = formatter.formatCellValue(cell);
      return CellData;
	}
 

 
    	}