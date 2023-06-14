package TestNGSoftAssertion;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example1 {
	
	@Test
	public void TC1() {
		SoftAssert s=new SoftAssert();
		String expText="hi";
		String actText="hello";
		s.assertEquals(actText, expText,"Failed: expected hi but found hello");
		
		boolean exp=true;
		//assertTrue(exp,"failed expected true");
		s.assertFalse(exp,"failed: expected false");
		s.assertAll();
		
	}

}
