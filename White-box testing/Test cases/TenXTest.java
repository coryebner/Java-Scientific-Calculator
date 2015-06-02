package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class TenXTest {

	@Test
	public void zero_as_input_01() {
		TenX tester = new TenX();
		assertEquals(Math.pow(10.0, 0.0), tester.function(0.0), 0.0);
	}
	
	@Test
	public void zero_as_input_02() {
		TenX tester = new TenX();
		assertEquals((Math.pow(10.0, 1.0))/10.0, tester.function(0.0), 0.0);
	}

	@Test
	public void one_as_input() {
		TenX tester = new TenX();
		assertEquals(Math.pow(10.0, 1.0), tester.function(1.0), 0.0);
	}
	
	@Test
	public void negative_one_input() {
		TenX tester = new TenX();
		assertEquals(Math.pow(10.0, -1.0), tester.function(-1.0), 0.0);
	}
	
	@Test
	public void negative_large_input() {
		TenX tester = new TenX();
		assertEquals(Math.pow(10.0, -1000.0), tester.function(-1000.0), 0.0);
	}
	
	@Test
	public void negative_nomial_input() {
		TenX tester = new TenX();
		assertEquals((Math.pow(10.0, 3.0))/10.0, tester.function(2.0), 0.0);
	}
	
	@Test
	public void inverse_identity_test() {
		TenX tester = new TenX();
		assertEquals(Math.pow(10.0, Math.log10(10.0)), tester.function(Math.log10(10.0)), 0.0);
	}
	
	@Test
	public void positive_large_input() {
		TenX tester = new TenX();
		assertEquals(Math.pow(10.0, 1000.0), tester.function(1000.0), 0.0);
	}
	
	@Test
	public void positive_small_input() {
		TenX tester = new TenX();
		assertEquals(Math.pow(10.0, 0.0001), tester.function(0.0001), 0.0);
	}
}
