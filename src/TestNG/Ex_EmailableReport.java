package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_EmailableReport {
	@Test
	public void TC1()//test case 1 or test method
	{
		//System.out.println("running TC1 test case");
		Reporter.log("running TC1 test case",true);
	}
	@Test
	public void TC2()//test case 2 or test method
	{
		//System.out.println("running TC2 test case");
		Reporter.log("running TC2 test case",true);
	}

}
