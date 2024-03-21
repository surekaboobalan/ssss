package org.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_excelsheet {
	public static void main(String[] args) throws Exception, IOException  {
		File f=new File("C:\\Users\\hey\\eclipse-workspace\\cucumber\\amazon.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		
		w.createSheet("adoctin").createRow(0).createCell(0).setCellValue("adoctin_username");
		w.getSheet("adoctin").getRow(0).createCell(1).setCellValue("surekaboobalan");
		w.getSheet("adoctin").createRow(1).createCell(0).setCellValue("password");
		w.getSheet("adoctin").getRow(1).createCell(1).setCellValue("7F9ML3");
		w.getSheet("adoctin").createRow(2).createCell(0).setCellValue("first name");
		w.getSheet("adoctin").getRow(2).createCell(1).setCellValue("sureka");
		w.getSheet("adoctin").createRow(3).createCell(0).setCellValue("lastname");
		w.getSheet("adoctin").getRow(3).createCell(1).setCellValue("boobalan");
		w.getSheet("adoctin").createRow(4).createCell(0).setCellValue("adrress");
		w.getSheet("adoctin").getRow(4).createCell(1).setCellValue("kk nagar,ch-78");
		w.getSheet("adoctin").createRow(5).createCell(0).setCellValue("card no");
		w.getSheet("adoctin").createRow(5).createCell(1).setCellValue("1234567887654321");
		w.getSheet("adoctin").createRow(6).createCell(0).setCellValue("cvv");
		w.getSheet("adoctin").createRow(5).createCell(1).setCellValue("123");
		
		
		
		
		
		FileOutputStream fo=new FileOutputStream(f);             	
		w.write(fo);
		w.close();
		
	}

}
