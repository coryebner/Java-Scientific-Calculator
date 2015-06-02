package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhiteBoxInverseTest {

	@Test
	public void testFunctionDouble() {
		Inverse test = new Inverse();
		
		//Checking a large negative number
		assertEquals("Inverse Test: -345",(double)-0.0028985507246377,(double)test.function(-345),(double)0.00000001);
		
		//Checking a small negative number
		assertEquals("Inverse Test: -2",(double)-0.5,(double)test.function(-2),(double)0.00000001);
		
		//Checking 0
		assertEquals("Inverse Test: 0",Double.POSITIVE_INFINITY,(double)test.function(0),(double)0.00000001);
		
		//Checking small positive number
		assertEquals("Inverse Test: 3",(double)0.33333333,(double)test.function(3),(double)0.00000001);
		
		//Checking large positive number
		assertEquals("Inverse Test: 345",(double)0.0028985507246377,(double)test.function(345),(double)0.00000001);
		
		//Positive decimal value
		assertEquals("Testing 1.4",(double)0.71428571,test.function(1.4),(double)0.000001);
						
		//Negative decimal value
		assertEquals("Testing -2.6",(double)-0.38461538,test.function(-2.6),(double)0.000001);
	}
}
