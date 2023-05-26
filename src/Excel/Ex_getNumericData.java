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

public class Ex_getNumericData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\Excel\\auto1.xlsx");
		Workbook book=WorkbookFactory.create(file);
		Sheet sh = book.getSheet("Sheet1");
		Row rw= sh.getRow(0);
		Cell cl=rw.getCell(1);
		double value=cl.getNumericCellValue();
		System.out.println(value);
	}

}
