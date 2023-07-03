package TestNGSoftAssertion;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example1 {
	
	@Test
	public void TC1() {
		SoftAssert s=new SoftAssert();
		String expText="hello";
		String actText="hi";
		s.assertEquals(actText, expText,"Failed: expected hi but found hello");
		
		boolean exp=false;
		s.assertTrue(exp,"failed expected true");
		//s.assertFalse(exp,"failed: expected false");
		s.assertAll();
		
	}

}
