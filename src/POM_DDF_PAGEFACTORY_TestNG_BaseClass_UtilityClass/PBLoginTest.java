package POM_DDF_PAGEFACTORY_TestNG_BaseClass_UtilityClass;

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

public class PBLoginTest extends Base_Class {
	//WebDriver driver;
	
	PBLoginPage pbLogin;
	PBMobNoPage pbMobno;
	PBPasswordPage pbPwd;
	PBHomePage pbHome;
	PBMyAccPage pbMyAcc;
	PBProfilePage pbProfile;
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		
		
		initializeBrowser();
		pbLogin=new PBLoginPage(driver);
		pbMobno=new PBMobNoPage(driver);
		pbPwd=new PBPasswordPage(driver);
		pbHome=new PBHomePage(driver);
		pbMyAcc=new PBMyAccPage(driver);
		pbProfile=new PBProfilePage(driver);
	}
	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		pbLogin.clickPBLoginPageSignIn();
		Thread.sleep(1000);
		pbMobno.enterPBMobNoPagemobNo(Utility_Class.getTestData(0, 0));
		Thread.sleep(1000);
		pbMobno.clickPBMobNoPAgeSignInWithPwd();
		Thread.sleep(1000);
		pbPwd.enterPBPasswordPagePwd(Utility_Class.getTestData(0, 1));
		Thread.sleep(1000);
		pbPwd.clickPBPasswordPageSignIn();
		Thread.sleep(3000);
		
	}
	@Test
	public void verifyFullName() throws InterruptedException, EncryptedDocumentException, IOException
	{
		pbHome.openDDOptionPBHomePagemyAcc();
		Thread.sleep(3000);
		pbMyAcc.clickPBMyAccPageMYProfile();
		
		pbProfile.switchToChildWindow();
		String actTest=pbProfile.getPBProfilePageFullName();
		String expText=Utility_Class.getTestData(0, 2);
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
