package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_GetNumericDtaAsString {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\\\pooja\\\\VelocitySoftwareTesting\\\\AUTOMATION\\\\Excel\\\\auto1.xlsx");
		 String value = WorkbookFactory.create(file).getSheet("Sheet4").getRow(0).getCell(2).getStringCellValue();
		 System.out.println(value);
	}

}
