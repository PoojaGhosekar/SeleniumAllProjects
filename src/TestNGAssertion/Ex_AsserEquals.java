package TestNGAssertion;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_AsserEquals {
	@Test
	public void TC1() {
		String expText="hi";
		String actText="hello";
		assertEquals(actText, expText,"Failed: expected hi");
		
	}

}
