package TestNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_keyword_priority {
	@Test(priority=3)
	public void TC1() {
		Reporter.log("TC1 running", true);
		
	}
	@Test(priority=0)
	public void TC2() {
		Reporter.log("TC2 running", true);
		
	}
	@Test(priority=-1)
	public void TC3() {
		Reporter.log("TC3 running", true);
		
	}

}
