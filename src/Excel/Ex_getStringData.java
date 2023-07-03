package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_getStringData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	   FileInputStream file=new FileInputStream("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\Excel\\auto1.xlsx");//Fetching file
	   Workbook book=WorkbookFactory.create(file);//opening a file
	   Sheet sh=book.getSheet("Sheet1");//opening specific sheet
	   Row row=sh.getRow(0);//particular rowindex start with 0
	   Cell cell=row.getCell(0);//particular column/cell index start with 0
	   String value=cell.getStringCellValue();//get only string value
	   System.out.println(value);
	}

}
