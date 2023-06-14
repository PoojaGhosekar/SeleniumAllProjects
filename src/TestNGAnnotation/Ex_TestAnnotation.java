package TestNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex_TestAnnotation {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("opening browser", true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login to app",true);
		
	}
	@Test
	public void TC1() {
		Reporter.log("TC1 running",true);
		
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout to app", true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closing browser", true);
	}
	@Test
	public void TC2() {
		Reporter.log("TC2 running",true);
		
	}

}
