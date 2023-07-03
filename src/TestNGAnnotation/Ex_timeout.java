package TestNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_timeout {
//	@Test
//	public void login() throws InterruptedException {
//		
////		Reporter.log("TC1 running",true);
//		
//	}
	@Test(timeOut=5000)
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		Reporter.log("TC running", true);
	} 

}
