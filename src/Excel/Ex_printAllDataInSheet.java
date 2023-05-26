package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_printAllDataInSheet {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\Excel\\auto1.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		int lastrowindex = sh.getLastRowNum();
		
		
		for(int i=0;i<=lastrowindex;i++)
		{
			int lastcellindex=sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=lastcellindex;j++)
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}

}
