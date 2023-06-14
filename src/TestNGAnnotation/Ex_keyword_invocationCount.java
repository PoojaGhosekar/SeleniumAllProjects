package TestNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_keyword_invocationCount {
	@Test(invocationCount=3)
	public void TC1() {
		Reporter.log("TC1 running", true);
		
	}

}
