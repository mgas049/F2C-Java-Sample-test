package Faren2Cels;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class testConversion {

	@Test
	public void testTempConversion() throws Throwable {
		Conversion underTest = new Conversion();
		//when 
		double temperature = 80.0d;
		String unit = "";
		double result = underTest.tempConversion(temperature, unit);
		assertEquals(176.0d, result, 0.0);
	}

}
