package TestNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_keywordCombination {
	@Test(invocationCount=2,priority=1,enabled=false)
	public void Tc1() {
		Reporter.log("Tc1 running",true);
		
	}
	@Test
	public void Tc2() {
		Reporter.log("Tc2 running",true);
		
	}

}
