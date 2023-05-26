package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_FacebookLoginUsingExcel {
	public static void main(String[] args) throws IOException, InterruptedException   {
		FileInputStream file=new FileInputStream("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\Excel\\Book.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		//get username and password from excel file
		String username=sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(username);
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		System.out.println(password);
		
		Cell cellinfo = sh.getRow(0).getCell(0);
		CellType s1 = cellinfo.getCellType();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//passing values from excel sheet to facebook login page
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
