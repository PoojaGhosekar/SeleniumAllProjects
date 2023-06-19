package POM_DDF_PAGEFACTORY_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest {
	WebDriver driver;
	Sheet sh;
	PBLoginPage pbLogin;
	PBMobNoPage pbMobno;
	PBPasswordPage pbPwd;
	PBHomePage pbHome;
	PBMyAccPage pbMyAcc;
	PBProfilePage pbProfile;
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new FileInputStream("C:\\pooja\\VelocitySoftwareTesting\\AUTOMATION\\Excel\\POMWithDDFTestNG.xlsx");
		WorkbookFactory.create(file).getSheet("DDF");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		pbLogin=new PBLoginPage(driver);
		pbMobno=new PBMobNoPage(driver);
		pbPwd=new PBPasswordPage(driver);
		pbHome=new PBHomePage(driver);
		pbMyAcc=new PBMyAccPage(driver);
		pbProfile=new PBProfilePage(driver);
	}
	@BeforeMethod
	public void loginToApp() throws InterruptedException
	{
		pbLogin.clickPBLoginPageSignIn();
		Thread.sleep(1000);
		pbMobno.enterPBMobNoPagemobNo(sh.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		pbMobno.clickPBMobNoPAgeSignInWithPwd();
		Thread.sleep(1000);
		pbPwd.enterPBPasswordPagePwd(sh.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		pbPwd.clickPBPasswordPageSignIn();
		Thread.sleep(1000);
		
	}
	@Test
	public void verifyFullName() throws InterruptedException
	{
		pbHome.openDDOptionPBHomePagemyAcc();
		Thread.sleep(1000);
		pbMyAcc.clickPBMyAccPageMYProfile();
		Thread.sleep(1000);
		pbProfile.switchToChildWindow();
		Thread.sleep(1000);
		String actTest=pbProfile.getPBProfilePageFullName();
		String expText=sh.getRow(0).getCell(2).getStringCellValue();
		Assert.assertEquals(actTest, expText,"Failed: Both results are different");
		
		
	}
	@AfterMethod
	public void logoutToApp()
	{
		
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.quit();
	}

}
