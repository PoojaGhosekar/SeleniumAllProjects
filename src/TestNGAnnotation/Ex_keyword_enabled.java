package TestNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_keyword_enabled {
	@Test(enabled=false)
	public void TC1() {
		Reporter.log("TC1 running", true);
		
	}
	@Test
	public void TC2() {
		Reporter.log("TC2 running", true);
		
	}

}
