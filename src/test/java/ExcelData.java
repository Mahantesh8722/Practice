import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelData {
public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("file path");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet("").getRow(1).getCell(0).getStringCellValue(); //toString() & getStringCellValue()
	System.out.println(data);
}
}
