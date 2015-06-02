package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogFactorialIntegrationTests {

	@Test
	public void normalValue() {
		Factorial test = new Factorial();
		Log logTest = new Log();

		//Testing normal value given
		assertEquals("Log-Factorial Test: 5",(double)4.78749,logTest.function(test.function(5)),(double)0.0001);
	}
	
	@Test
	public void zeroTest() {
		Factorial test = new Factorial();
		Log logTest = new Log();
		
		//Testing with a zero
		assertEquals("Log-Factorial Test: 0",(double)0,logTest.function(test.function(0)), (double)0.0001);
	}
	
	@Test
	public void largeNumber() {
		Factorial test = new Factorial();
		Log logTest = new Log();
		
		//Testing with a big number (close to max so no no overflow)
		assertEquals("Log-Factorial Test: 20",(double)42.33561,logTest.function(test.function(20)),(double)0.0001);
	}

	@Test
	public void exceptionTest() {
		Factorial test = new Factorial();
		Log logTest = new Log();
		
		//Testing decimal value
		try {
			assertEquals("Factorial Test: 2.5",(double)1.20097,logTest.function(test.function(2.5)),(double)0.0001);
		}
		catch(ArithmeticException e) {
			fail("Arithmetic Exception thrown during factorial test of 2.5");
		}
	}
	
	@Test(expected = ArithmeticException.class)
	public void negativeTest() {
		Factorial test = new Factorial();
		Log logTest = new Log();
		
		//Expecting to get an Arithmetic Exception thrown
		logTest.function(test.function(-5));
	}
}
