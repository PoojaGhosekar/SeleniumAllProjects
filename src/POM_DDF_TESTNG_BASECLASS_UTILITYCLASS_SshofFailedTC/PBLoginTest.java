package POM_DDF_TESTNG_BASECLASS_UTILITYCLASS_SshofFailedTC;

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
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

public class PBLoginTest extends Base_Class {
	//WebDriver driver;
	Sheet sh;
	PBLoginPage pbLogin;
	PBMobNoPage pbMobno;
	PBPasswordPage pbPwd;
	PBHomePage pbHome;
	PBMyAccPage pbMyAcc;
	PBProfilePage pbProfile;
	int TCID;
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
		pbMobno.enterPBMobNoPagemobNo(Utility_Class.getPFData("MobNo"));
		Thread.sleep(1000);
		pbMobno.clickPBMobNoPAgeSignInWithPwd();
		Thread.sleep(1000);
		pbPwd.enterPBPasswordPagePwd(Utility_Class.getPFData("PWD"));
		Thread.sleep(1000);
		pbPwd.clickPBPasswordPageSignIn();
		Thread.sleep(1000);
		
	}
	@Test
	public void verifyFullName() throws InterruptedException, EncryptedDocumentException, IOException
	{
		TCID=101;
		pbHome.openDDOptionPBHomePagemyAcc();
		Thread.sleep(1000);
		pbMyAcc.clickPBMyAccPageMYProfile();
		Thread.sleep(1000);
		pbProfile.switchToChildWindow();
		Thread.sleep(1000);
		String actTest=pbProfile.getPBProfilePageFullName();
		String expText=Utility_Class.getTestData(0, 2);
		Assert.assertEquals(actTest, expText,"Failed: Both results are different");
		Thread.sleep(2000);
		pbProfile.switchToParentWindow();
		Thread.sleep(2000);
		pbHome.openDDOptionPBHomePagemyAcc();
		Thread.sleep(2000);
		pbHome.clickSignOutPBHomePage();
		Thread.sleep(2000);
	}
	@Test
	public void verifyEmailId() throws InterruptedException, EncryptedDocumentException, IOException
	{
		TCID=102;
		pbHome.openDDOptionPBHomePagemyAcc();
		Thread.sleep(1000);
		pbMyAcc.clickPBMyAccPageMYProfile();
		Thread.sleep(1000);
		pbProfile.switchToChildWindow();
		Thread.sleep(1000);
		pbProfile.switchToParentWindow();
		Thread.sleep(2000);
		String actText=pbProfile.getPBProfilePageEmailId();
		String expText=Utility_Class.getTestData(0, 3);
		Assert.assertEquals(actText, expText,"Failed: both results are different");
		
	}
	@AfterMethod
	public void logoutToApp(ITestResult it) throws IOException
	{
		Reporter.log("after method");
//		if(it.getStatus()==ITestResult.FAILURE)
//		{
//			Utility_Class.captureScreenshot(driver, TCID);
//		}
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
