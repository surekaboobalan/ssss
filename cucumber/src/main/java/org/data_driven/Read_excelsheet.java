package org.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_excelsheet {
public static void main(String[] args) throws IOException {
	

	File filepath=new File("C:\\Users\\hey\\eclipse-workspace\\cucumber\\amazon.xlsx");//path
	FileInputStream fi=new FileInputStream(filepath);//
	Workbook w= new XSSFWorkbook(fi);
	
	Sheet sheetAt = w.getSheetAt(1);
	
	Row row = sheetAt.getRow(1);
	
	Cell cell = row.getCell(0);
	
	CellType cellType = cell.getCellType();
	
	if (cellType.equals(cellType.STRING)) {
		System.out.println(cell.getStringCellValue());
		
	} else if (cellType.equals(cellType.NUMERIC)) {
		
		//System.out.println(cell.getNumericCellValue());
	double numericCellValue = cell.getNumericCellValue();
	
	int value=(int)numericCellValue;
	System.out.println(value);
		
	} 
	

	}
}
