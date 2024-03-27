import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelMultiplevalue {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("file path");
		Workbook wb = WorkbookFactory.create(fis);
		int rowNum = wb.getSheet("").getLastRowNum();
		for(int i=0; i<=rowNum; i++) {
		String un=wb.getSheet("").getRow(1).getCell(1).toString();
		String pw=wb.getSheet("").getRow(1).getCell(2).toString();
		System.out.println(un + " "+ pw);
		
	}
    }
	}
