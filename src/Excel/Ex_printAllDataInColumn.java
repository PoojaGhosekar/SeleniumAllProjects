package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_printAllDataInColumn {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\Excel\\auto1.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastindex = sh.getLastRowNum();
		for(int i=0;i<=lastindex;i++)
		{
			String value = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
		
	}

}
