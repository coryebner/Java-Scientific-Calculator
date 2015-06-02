package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhiteBoxFactorialTest {

	@Test
	public void testFunctionDouble() {
		Factorial test = new Factorial();

		//Testing normal value given
		assertEquals("Factorial Test: 5",(double)120,test.function(5),(double)0);
		
		//Testing with a zero
		assertEquals("Factorial Test: 0",(double)1,test.function(0), (double)0);
		
		//Testing with a big number (close to max so no no overflow)
		assertEquals("Factorial Test: 12",(double)479001600,test.function(12),(double)0);
		
		//Testing decimal value
		try {
			assertEquals("Factorial Test: 2.5",(double)1.875,test.function(2.5),(double)0);
		}
		catch(ArithmeticException e) {
			fail("Arithmetic Exception thrown during factorial test of 2.5");
		}
	}
	
	@Test(expected = ArithmeticException.class)
	public void testExceptionFactorial() {
		Factorial test = new Factorial();
		
		//Expecting to get an Arithmetic Exception thrown
		test.function(-5);
	}

}
