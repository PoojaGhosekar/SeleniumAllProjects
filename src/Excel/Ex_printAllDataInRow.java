package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_printAllDataInRow {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\\\pooja\\\\VelocitySoftwareTesting\\\\AUTOMATION\\\\Excel\\\\auto1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		 int lastcellIndex=sh.getRow(0).getLastCellNum()-1;//2
		 System.out.println(lastcellIndex);
		 for(int i=0;i<=lastcellIndex;i++)
		 {
			String value = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		 }
		 
}
}