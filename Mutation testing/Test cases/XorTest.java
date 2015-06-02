package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class XorTest {

	@Test
	public void binary_identity_test_01() {
		Xor tester = new Xor();
		assertEquals(0.0, tester.function(0.0, 0.0), 0.0);
	}
	
	@Test
	public void binary_identity_test_02() {
		Xor tester = new Xor();
		assertEquals(1.0, tester.function(0.0, 1.0), 0.0);
	}
	
	@Test
	public void binary_identity_test_03() {
		Xor tester = new Xor();
		assertEquals(1.0, tester.function(1.0, 0.0), 0.0);
	}
	
	@Test
	public void binary_identity_test_04() {
		Xor tester = new Xor();
		assertEquals(0.0, tester.function(1.0, 1.0), 0.0);
	}
	
	@Test
	public void decimal_input_test() {
		Xor tester = new Xor();
		assertEquals(1983.0, tester.function(1110.0, 1001.0), 0.0);
	}
	
	@Test
	public void infinity_x_input_test() {
		Xor tester = new Xor();
		double inf = Double.POSITIVE_INFINITY;
		try {
			   tester.function(inf, 1.0); 
			   fail("Exception was suppose to be thrown - Failed");
			} 
		catch (Exception e) {
				System.out.println("Exception was thrown - Passed");
			} 
	}
	
	@Test
	public void infinity_y_input_test() {
		Xor tester = new Xor();
		double inf = Double.POSITIVE_INFINITY;
		try {
			   tester.function(1.0, inf); 
			   fail("Exception was suppose to be thrown - Failed");
			} 
		catch (Exception e) {
				System.out.println("Exception was thrown - Passed");
			} 
	}
	
	@Test
	public void infinity_both_input_test() {
		Xor tester = new Xor();
		double inf = Double.POSITIVE_INFINITY;
		try {
			   tester.function(inf, inf); 
			   fail("Exception was suppose to be thrown - Failed");
			} 
		catch (Exception e) {
				System.out.println("Exception was thrown - Passed");
			} 
	}
	
	@Test
	public void nan_x_input_test() {
		Xor tester = new Xor();
		double nan = Double.NaN;
		try {
			   tester.function(nan, 1.0); 
			   fail("Exception was suppose to be thrown - Failed");
			} 
		catch (Exception e) {
				System.out.println("Exception was thrown - Passed");
			} 
	}
	
	@Test
	public void nan_y_input_test() {
		Xor tester = new Xor();
		double nan = Double.NaN;
		try {
			   tester.function(1.0, nan); 
			   fail("Exception was suppose to be thrown - Failed");
			} 
		catch (Exception e) {
				System.out.println("Exception was thrown - Passed");
			} 
	}
	
	@Test 
	public void nan_both_input_test() {
		Xor tester = new Xor();
		double nan = Double.NaN;
		try {
			   tester.function(nan, nan); 
			   fail("Exception was suppose to be thrown - Failed");
			} 
		catch (Exception e) {
				System.out.println("Exception was thrown - Passed");
			} 
	}
	
	@Test
	public void negative_x_input_test() {
		Xor tester = new Xor();
		assertEquals(-1983.0, tester.function(-1110.0, 1001.0), 0.0);
	}
	
	@Test
	public void negative_y_input_test() {
		Xor tester = new Xor();
		assertEquals(-1983.0, tester.function(1110.0, -1001.0), 0.0);
	}
	
	@Test
	public void nominal_x_y_input_test() {
		Xor tester = new Xor();
		assertEquals(7.0, tester.function(9.0, 14.0), 0.0);
	}

}
