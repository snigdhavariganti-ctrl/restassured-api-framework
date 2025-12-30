package com.api.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static  Object[][] getTestData(String filepath,String sheetName) throws FileNotFoundException {
		
		Object[][] data = null;
		try {
		FileInputStream fileinputstream = new FileInputStream(filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(fileinputstream) ;
     XSSFSheet sheet   =  workbook.getSheet(sheetName);
     
      int rowCount =sheet.getPhysicalNumberOfRows();
      int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
      
      data = new Object[rowCount-1][columnCount];
        
      for(int i=1;i<rowCount;i++) {
    	  
       XSSFRow row =sheet.getRow(i);
    
       
       for(int j=0;j<columnCount;j++) {
    	   
    	XSSFCell cell=   row.getCell(j);
    	   
    	data[i-1][j] = getCellValue(cell);
       }
    
      }
      	
	}catch(Exception e) {
		e.printStackTrace();
	}
		return data;

}
	
	private static Object getCellValue(XSSFCell cell) {
		
		if(cell==null) {
		
		return "";
		
	}
		switch (cell.getCellType()) {
        case STRING:
            return cell.getStringCellValue();

        case NUMERIC:
            if (DateUtil.isCellDateFormatted(cell)) {
                return cell.getDateCellValue();
            }
            return (long) cell.getNumericCellValue();

        case BOOLEAN:
            return cell.getBooleanCellValue();

        case BLANK:
            return "";

        default:
            return cell.toString();
    }
}
}
		
		

	
	
	
