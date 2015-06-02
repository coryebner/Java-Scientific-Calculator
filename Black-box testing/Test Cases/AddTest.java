package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	// Large negative x, Large negative y
	public void test01() {
		jscicalc.pobject.Add tester = new jscicalc.pobject.Add();

		assertEquals("Add Test: -8000000 + -8000000", -16000000, tester.function(-8000000, -8000000), 0.000000001);
			
	}
	
	@Test
	// small negative x, Large negative y
	public void test02() {
		jscicalc.pobject.Add tester = new jscicalc.pobject.Add();

		assertEquals("Add Test: -2 + -8000000", -8000002, tester.function(-2, -8000000), 0.000000001);
			
	}

	@Test
	// small negative x, small negative y
	public void test03() {
		jscicalc.pobject.Add tester = new jscicalc.pobject.Add();

		assertEquals("Add Test: -2 + -2", -4, tester.function(-2, -2), 0.000000001);
			
	}
	
	@Test
	// Large negative x, small negative y
	public void test04() {
		jscicalc.pobject.Add tester = new jscicalc.pobject.Add();

		assertEquals("Add Test: -8000000 + -2", -8000002, tester.function(-8000000, -2), 0.000000001);
			
	}
	
	@Test
	// zero x, non zero y
	public void test05() {
		jscicalc.pobject.Add tester = new jscicalc.pobject.Add();

		assertEquals("Add Test: 0 + 5", 5, tester.function(0, 5), 0.000000001);
			
	}
	
	@Test
	// zero x, zero y
	public void test06() {
		jscicalc.pobject.Add tester = new jscicalc.pobject.Add();

		assertEquals("Add Test: 0 + 0", 0, tester.function(0, 0), 0.000000001);
			
	}
	
	@Test
	// non zero x, zero y
	public void test07() {
		jscicalc.pobject.Add tester = new jscicalc.pobject.Add();

		assertEquals("Add Test: 5 + 0", 5, tester.function(5, 0), 0.000000001);
			
	}
	
	@Test
	// small positive x, small positive y
	public void test08() {
		jscicalc.pobject.Add tester = new jscicalc.pobject.Add();

		assertEquals("Add Test: 50 + 60", 110, tester.function(50, 60), 0.000000001);
			
	}
	
	@Test
	// large positive x, small positive y
	public void test09() {
		jscicalc.pobject.Add tester = new jscicalc.pobject.Add();

		assertEquals("Add Test: 479001600 + 60", 479001660, tester.function(479001600, 60), 0.000000001);
			
	}
	
	@Test
	// large positive x, Large positive y
	public void test10() {
		jscicalc.pobject.Add tester = new jscicalc.pobject.Add();

		assertEquals("Add Test: 479001600 + 479001600", 958003200, tester.function(479001600, 479001600), 0.000000001);
			
	}
	
	@Test
	// small positive x, Large positive y
	public void test11() {
		jscicalc.pobject.Add tester = new jscicalc.pobject.Add();

		assertEquals("Add Test: 47 + 479001600", 479001647, tester.function(47, 479001600), 0.000000001);
			
	}
	
	@Test
	// Positive Decimal x,  positive decimal y
	public void test12() {
		jscicalc.pobject.Add tester = new jscicalc.pobject.Add();

		assertEquals("Add Test: 56.29 + 56.29", 112.58, tester.function(56.29, 56.29), 0.000000001);
			
	}
	
	@Test
	// Positive decimal x, Negative decimal y
	public void test13() {
		jscicalc.pobject.Add tester = new jscicalc.pobject.Add();

		assertEquals("Add Test: 56.29 + -56.29", 0, tester.function(56.29, -56.29), 0.000000001);
			
	}
	
	@Test
	// Negative decimal x, Positive decimal y
	public void test14() {
		jscicalc.pobject.Add tester = new jscicalc.pobject.Add();

		assertEquals("Add Test: -56.29 + 56.29", 0, tester.function(-56.29, 56.29), 0.000000001);
			
	}
	
	@Test
	// Negative decimal x, Negative decimal y
	public void test15() {
		jscicalc.pobject.Add tester = new jscicalc.pobject.Add();

		assertEquals("Add Test: -56.29 + -56.29", -112.58, tester.function(-56.29, -56.29), 0.000000001);
			
	}
}
