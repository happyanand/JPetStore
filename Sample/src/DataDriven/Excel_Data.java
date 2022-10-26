package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Data 
{
	public static void main(String[] args) throws IOException 
	{
		String excelfilepath = "\\D:\\Dept.xlsx";
		FileInputStream fis = new FileInputStream(excelfilepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		for(int r = 0; r<rows;r++)
		{
			XSSFRow row = sheet.getRow(r);
			
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell = row.getCell(c);
				
				switch(cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue());break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
				default:
					break;
				
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		
		
	}
}