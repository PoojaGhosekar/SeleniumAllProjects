package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_getCellSize {
	
		public static void main(String[] args) throws IOException {
			FileInputStream file=new FileInputStream("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\Excel\\auto1.xlsx");
			 short colSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
			 System.out.println(colSize);
}
}