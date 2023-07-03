package POM_DDF_PAGEFACTORY_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Utility_Class {
	//@Pooja 
	//This method is used to get testdata from excel
	//needs to pass 2 inputs 1-rowIndex,2-colIndex
	
	public static String getTestData(int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new FileInputStream("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\Excel\\POMWithDDFTestNG.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		
		return value;
	}

}
