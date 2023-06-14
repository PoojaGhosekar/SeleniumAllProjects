package TestNGAssertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Ex_AssertBoolean {
	@Test
	public void Tc1() {
		String expText="pooja";
		String actText="pooja";
		assertNotEquals(actText, expText,"Failed both results are match");
		boolean exp=true;
		//assertTrue(exp,"failed expected true");
		assertFalse(exp,"failed expected false");
		
	}
	
	
}
