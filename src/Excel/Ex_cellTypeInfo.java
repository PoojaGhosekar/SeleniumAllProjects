package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_cellTypeInfo {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\Excel\\auto1.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		CellType s1=sh.getRow(0).getCell(1).getCellType();
		System.out.println(s1);
		
  	    CellType s2=sh.getRow(0).getCell(2).getCellType();
		System.out.println(s2);
		
		CellType s3=sh.getRow(0).getCell(0).getCellType();
		System.out.println(s3);
		
	}

}
