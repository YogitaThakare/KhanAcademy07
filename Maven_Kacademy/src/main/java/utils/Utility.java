package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Utility {
	WebDriver driver;
	
	//XSSFWorkbook workbook;
	
	public static void captureScreen(WebDriver driver, String fileName) {
	
		try {
			TakesScreenshot ss = (TakesScreenshot)driver;
			File src = ss.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./ScreenShot/"+fileName+".png"));
			//File dest = new File("D:\\AkashSir\\Selenium\\New_ScreenShot\\Raj01.jpeg");
			//FileHandler.copy(src, dest);
		
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ScreenShot Capture :: "+e.getMessage());
		}
	}


	
	public static String getData(String sheetName, int row, int col) throws IOException {
		//FileInputStream file = new FileInputStream("D:\\AkashSir\\Selenium\\Excel\\Exc1.xlsx");
		//XSSFWorkbook workbook = null;
		 String cellValue="";
		 Cell value=null;

		try 
		{
			File file = new File("D:\\AkashSir\\Selenium\\Excel\\Exc5.xlsx");
			value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(col);
			cellValue = value.getStringCellValue();
		} 
		catch (IllegalStateException ise ) 
		{
			 double cellValueNumeric = value.getNumericCellValue();
			 cellValue = cellValueNumeric+"";
			 
			 cellValue=Double.toString(cellValueNumeric);
			 
		}
		catch (NullPointerException ise ) 
		{
			 ise.printStackTrace();
			 ise.getMessage();
		}
		
		return cellValue;
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	public Utility(String excelPath) {
//				try 
//				{
//					FileInputStream file = new FileInputStream("D:\\AkashSir\\Selenium\\Excel\\Exc1.xlsx");
//					XSSFWorkbook workbook = new XSSFWorkbook(file);
//					XSSFSheet sheet =workbook.getSheet("Group");
//				//	XSSFSheet sheet1 =workbook.createSheet("Data"); //Writing the data
//					
//					int rowCount = sheet.getLastRowNum();
//					
//				} 
//				catch (Exception e) 
//				{
//					e.printStackTrace();
//				}
//			}
//	
//	public int getRoeCount(String sheetName) {
//		
//		int row = wb.getSheet(sheetName).getLastRowNum();
//		row = row + 1;
//		return row;
//		
	//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Calendar cal = Calendar.getInstance();
//	Date time = cal.getTime();
//	String timespam = time.toString().replace(":", "-");
////======================================================		
//Random num = new Random();
//int n1;
//	
//for(int i = 1; i<= 5; i++)
//{
//	n1 = 1+num.nextInt(7);
//		
//	for(int j = 1; j <=5; j++)
//	{
//		
//		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	
//		File dest = new File("D:\\AkashSir\\Selenium\\New_ScreenShot\\ "+timespam+" "+i+"-SS-"+n1+".jpeg");
//		
//		FileHandler.copy(src, dest);
//	}
//		
// }
	
	
	
	
	
	
	
	
	
}















//String excelPath = "D:\\AkashSir\\Selenium\\Excel\\Exc1.xlsx";
//FileInputStream file;
//file = new FileInputStream(excelPath);
//String excelPath = "D:\\AkashSir\\Selenium\\Excel\\Exc1.xlsx";
//
//FileInputStream file = new FileInputStream(excelPath);
//
//Date value = WorkbookFactory.create(file).getSheet("Group").getRow(5).getCell(1).getDateCellValue();
//
//System.out.println(value);
