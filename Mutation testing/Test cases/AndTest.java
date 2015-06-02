package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class AndTest {

	@Test
	public void binary_identity_test_01() {
		And tester = new And();
		assertEquals(0.0, tester.function(0.0, 0.0), 0.0);
	}
	
	@Test
	public void binary_identity_test_02() {
		And tester = new And();
		assertEquals(0.0, tester.function(0.0, 1.0), 0.0);
	}
	
	@Test
	public void binary_identity_test_03() {
		And tester = new And();
		assertEquals(0.0, tester.function(1.0, 0.0), 0.0);
	}
	
	@Test
	public void binary_identity_test_04() {
		And tester = new And();
		assertEquals(1.0, tester.function(1.0, 1.0), 0.0);
	}
	
	
	@Test
	public void decimal_both_inputs_test_01() {
		And tester = new And();
		assertEquals(64.0, tester.function(1110.0, 1001.0), 0.0);
	}
	
	@Test
	public void infinity_both_inputs_test() {
		And tester = new And();
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
	public void infinity_y_input_test() {
		And tester = new And();
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
	public void NaN_both_input_test() {
		And tester = new And();
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
	public void NaN_y_input_test() {
		And tester = new And();
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
	public void negative_x_input_test() {
		And tester = new And();
		assertEquals(936.0, tester.function(-1110.0, 1001.0), 0.0);
	}
	
	@Test
	public void negative_y_input_test() {
		And tester = new And();
		assertEquals(64.0, tester.function(1110.0, -1001.0), 0.0);
	}
	
	@Test
	public void negative_both_inputs_test() {
		And tester = new And();
		assertEquals(-2046, tester.function(-1110.0, -1001.0), 0.0);
	}
}
