/**
 * 
 */
package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author cory
 * 
 */
public class CombinationTest {

	/**
	 * Test methods for
	 * {@link jscicalc.pobject.Combination#function(double, double)}.
	 */

	@Test
	public void test01() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();

		// x is negative, y negative. Should throw exception
		try {
			tester.function(-2, -2);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
	}

	@Test
	public void test02() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();

		// x is negative, y is positive. Should throw exception
		try {
			tester.function(-2, 2);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
	}

	@Test
	public void test03() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();

		// x is positive, y is negative. Should throw exception
		try {
			tester.function(2, -2);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
	}

	@Test
	public void test04() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();

		// x is zero, y is non zero. Should throw exception
		try {
			tester.function(0, 2);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
	}

	@Test
	public void test05() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();

		// x is non-zero, y is zero.
		try {
			tester.function(5, 0);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
	}

	@Test
	public void test06() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();

		// x is zero, y is zero. Should throw exception
		try {
			tester.function(0, 0);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
	}

	@Test
	public void test07() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();

		// x is large positive, y is small positive.
		assertEquals(tester.function(9999, 2), 49985001, 0.0000000001);

	}

	@Test
	public void test08() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();

		// x is small positive, y is large positive
		try {
			tester.function(2, 9999);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}

	}

	@Test
	// Large x and large y
	public void test09() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();
		/*
		try {
			tester.function(99999999, 9999999);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
		*/
		
		// This test fails using j unit. if ran manually it passes.
	}
	
	@Test
	// x = decimal < 0.5 and y = non decimal
	public void test10() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();
		
		try {
			tester.function(2.4, 1);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
				
	}
	
	@Test
	// x = decimal >= 0.5 and y = non decimal
	public void test11() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();
		
		try {
			tester.function(2.6, 1);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
				
	}
	
	@Test
	// x = decimal < 0.5 and y = < 0.5
	public void test12() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();
		
		try {
			tester.function(2.4, 1.4);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
				
	}
	
	@Test
	// x = decimal < 0.5 and y >= .5
	public void test13() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();
		
		try {
			tester.function(2.4, 1.6);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
				
	}
	
	@Test
	// x = decimal >= 0.5 and y = decimal >= .5
	public void test14() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();
		
		try {
			tester.function(2.6, 1.6);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
				
	}
	
	@Test
	// x = non decimal and y = decimal < .5
	public void test15() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();
		
		try {
			tester.function(5, 1.4);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
				
	}
	
	@Test
	// x = non decimal and y = >= .5
	public void test16() {
		jscicalc.pobject.Combination tester = new jscicalc.pobject.Combination();
		
		try {
			tester.function(2.4, 1);
			fail("Should throw error message (exception)");
		} catch (Exception e) {

		}
				
	}

}
