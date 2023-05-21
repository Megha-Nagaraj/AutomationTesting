package GenericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {
	
	public String getStringExcelData(String sheetName, int rowNum, int cellNum) throws Exception {

		FileInputStream fis = new FileInputStream(Constants.filepath);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(sheetName);

		XSSFRow row = sheet.getRow(rowNum);

		String data = row.getCell(cellNum).getStringCellValue();

		return data;
	}

	public double getNumericExcelData(String sheetName, int rowNum, int cellNum) throws Exception {

		FileInputStream fis = new FileInputStream(Constants.filepath);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(sheetName);

		XSSFRow row = sheet.getRow(rowNum);

		double data = row.getCell(cellNum).getNumericCellValue();

		return data;
	}

	public void setExcelData(String sheetName, int rowNum, int cellNum, String data) throws Exception {

		FileInputStream fis = new FileInputStream(Constants.filepath);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(sheetName);

		XSSFRow row = sheet.getRow(rowNum);

		XSSFCell cell = row.createCell(cellNum);

//			Write the data into the cell created using Java API -FileOutputStream
		FileOutputStream fos = new FileOutputStream(Constants.filepath);
		cell.setCellValue(data); // data declared in the parameter

		workbook.write(fos);

//			It must close the workbook
		workbook.close();

	}

}
