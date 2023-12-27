package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ExcelReader1 {
	
	//public WebDriver driver;
	public static int totalRow;

//	public ExcelReader1(WebDriver driver) {
//		this.driver = driver;
//	}
	

	public List<Map<String, String>> getData(String excelFilePath, String sheetName)
			throws InvalidFormatException, IOException {

		Workbook workbook = WorkbookFactory.create(new File(excelFilePath));
		Sheet sheet = workbook.getSheet(sheetName);
		workbook.close();
		return readSheet(sheet);
	}
	
	private List<Map<String, String>> readSheet(Sheet sheet) {

		Row row;
		Cell cell;

		totalRow = sheet.getLastRowNum();

		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();

		for (int currentRow = 1; currentRow <= totalRow; currentRow++) {

			row = sheet.getRow(currentRow);

			int totalColumn = row.getLastCellNum();

			LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();

			for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {

				cell = row.getCell(currentColumn);

				String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
						.getStringCellValue();

				columnMapdata.put(columnHeaderName, cell.getStringCellValue());
			}

			excelRows.add(columnMapdata);
		}

		return excelRows;
	}

	public int countRow() {

		return totalRow;
	}

}


//	List<String> usernameList = new ArrayList<String>();
//	List<String> passwordList = new ArrayList<String>();
//	public void readExcel() throws IOException {
//		FileInputStream excel = new FileInputStream("C:\\Users\\sanka\\OneDrive\\Desktop\\Selenium\\Register.xlsx");
//		Workbook workbook = new XSSFWorkbook(excel);
//		Sheet sheet = workbook.getSheet("Registerdata");
//		Iterator<Row> rowIterator = sheet.iterator();
//		while(rowIterator.hasNext()) {
//			Row rowValue = rowIterator.next();
//			Iterator<Cell> cloumnIterator = rowValue.iterator();
//			int i=2;
//			while(cloumnIterator.hasNext()) {
//				if(i%2==0) {
//				usernameList.add(cloumnIterator.next().getStringCellValue());
//				System.out.println("username List" +usernameList);
//			}else {
//				passwordList.add(cloumnIterator.next().getStringCellValue());
//				System.out.println("password List" +passwordList);
//			}
//		i++;
//		}
//		}
//		
//	
//	
//	
//	
//	}
//
//}
