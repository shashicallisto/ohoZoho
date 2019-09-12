package com.ZohoCrm.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This generic class is used to handle files
 * @author BTM-Faculty
 *
 */
public class FileLib {

	public String getKeyPropertyValue(String propPath, String key) throws Throwable
	{
		FileInputStream readProp=new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(readProp);
		return prop.getProperty(key, "Not Present");
		
	}
	
	
	public String getExcelData(String excelPath,
			String sheet, int r, int c)
			throws Throwable
	{
		FileInputStream readexcel=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(readexcel);
		String excelData = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		wb.close();
		return excelData;
		
		
	}
	
	public void setExcelData(String excelPath,
			String sheet, int r, int c, String cellValue)
			throws Throwable
	{
		FileInputStream readexcel=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(readexcel);
		wb.getSheet(sheet).createRow(r).createCell(c).setCellValue(cellValue);
		
		FileOutputStream writeExcel=new FileOutputStream(excelPath);
		wb.write(writeExcel);
		wb.close();
	}
	
	public int getRowCount(String excelPath, String sheet) throws Throwable
	{
		FileInputStream readexcel=new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(readexcel);
	int rowCount = wb.getSheet(sheet).getLastRowNum();
	return rowCount;
		
	}
	
}
