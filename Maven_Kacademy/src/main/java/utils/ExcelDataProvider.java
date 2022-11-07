package utils;

public class ExcelDataProvider {
	
	
//	@DataProvider(name="test1data")
//	public void getData{
//		
//	}
	public void testData(String excelPath,String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath,sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		for(int i = 1; i < rowCount; i++) 
		{
			for(int j = 0; j < colCount; j++) 
			{
				String cellData = excel.getCellDataString(i, j);
				System.out.println(cellData+" | ");
				
			}
		}
		
	}

}
