package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogTest {

	@Test
	// Large negative Number, should throw error
	public void test01() {
		jscicalc.pobject.Log tester = new jscicalc.pobject.Log();

		try {
			tester.function(-8000000);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
			
	}
	
	@Test
	// small negative Number, should throw error
	public void test02() {
		jscicalc.pobject.Log tester = new jscicalc.pobject.Log();

		try {
			tester.function(-2);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
			
	}
	
	@Test
	// Zero
	public void test03() {
		jscicalc.pobject.Log tester = new jscicalc.pobject.Log();

		assertEquals("Log Test: 0", Double.NEGATIVE_INFINITY, tester.function(0), 0.00001);
			
	}
	
	@Test
	// small positive
	public void test04() {
		jscicalc.pobject.Log tester = new jscicalc.pobject.Log();

		assertEquals("Log Test: 56", 1.748188027, tester.function(56), 0.000000001);
			
	}
	
	@Test
	// large positive
	public void test05() {
		jscicalc.pobject.Log tester = new jscicalc.pobject.Log();

		assertEquals("Log Test: 479001600", 8.6803369641, tester.function(479001600), 0.000000001);
			
	}
	
	@Test
	// positive decimal
	public void test06() {
		jscicalc.pobject.Log tester = new jscicalc.pobject.Log();

		assertEquals("Log Test: 576.78654", 2.7610151171, tester.function(576.78654), 0.000000001);
			
	}
	
	@Test
	// negative decimal
	public void test07() {
		jscicalc.pobject.Log tester = new jscicalc.pobject.Log();

		try {
			tester.function(-576.78654);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}	
	}

}
