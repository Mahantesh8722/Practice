import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataWrite {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("file path");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("").getRow(0).getCell(0).setCellValue("");
		FileOutputStream fos = new FileOutputStream("file path");
		wb.write(fos);
		wb.close();
	}
}
