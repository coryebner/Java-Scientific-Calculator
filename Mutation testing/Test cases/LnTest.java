package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class LnTest {

	@Test
	public void identity_test_01() {
		Ln tester = new Ln();
		assertEquals(0.0, tester.function(1.0), 0.0);
	}
	
	@Test
	public void identity_test_02() {
		Ln tester = new Ln();
		assertEquals(Math.log(Math.pow(2.0,2.0)), 2.0 * tester.function(2.0), 0.0);
	}
	
	@Test
	public void identity_test_03() {
		Ln tester = new Ln();
		assertEquals(2.0, tester.function(Math.exp(2.0)), 0.0);
	}
	
	@Test
	public void identity_test_04() {
		Ln tester = new Ln();
		assertEquals(Math.log(4.0) + Math.log(3.0), tester.function(4.0 * 3.0), 0.0);
	}
	
	@Test
	public void negative_one_input() {
		Ln tester = new Ln();
		assertEquals(Math.log(-1), tester.function(-1), 0.0);
	}
	
	@Test
	public void infinity_input() {
		Ln tester = new Ln();
		double inf = Double.POSITIVE_INFINITY;
		assertEquals(Math.log(inf), tester.function(inf), 0.0);

	}
	
	@Test
	public void negative_zero_input() {
		Ln tester = new Ln();
		assertEquals(Math.log(-0), tester.function(-0), 0.0);
	}
	
	@Test
	public void postive_large_input() {
		Ln tester = new Ln();
		assertEquals(Math.log(1000), tester.function(1000), 0.0);
	}
	
	@Test
	public void positive_small_input() {
		Ln tester = new Ln();
		assertEquals(Math.log(0.0001), tester.function(0.0001), 0.0);
	}
	
	@Test
	public void zero_as_input() {
		Ln tester = new Ln();
		assertEquals(Math.log(0), tester.function(0), 0.0);
	}
}
