package TestNGGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example_groupingTestcase1 {
	@Test(groups="login")
	public void Tc1() {
		Reporter.log("Tc1 running");
		
	}
	@Test(groups="setting")
	public void Tc2() {
		Reporter.log("Tc2 running");
	}
	@Test(groups="profile")
	public void Tc3() {
		Reporter.log("Tc3 running");
	}


}
