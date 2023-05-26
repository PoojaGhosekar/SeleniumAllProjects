package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_getBooleanData {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\Excel\\auto1.xlsx");
		boolean value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
		System.out.println(value);
		
		//boolean value1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getBooleanCellValue();
	}

}
