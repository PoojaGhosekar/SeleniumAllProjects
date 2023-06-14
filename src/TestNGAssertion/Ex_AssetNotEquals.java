package TestNGAssertion;

import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class Ex_AssetNotEquals {
	@Test
	public void Tc1() {
		String expText="pooja";
		String actText="pooja";
		assertNotEquals(actText, expText,"Failed both results are match");
		
	}

}
