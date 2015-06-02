package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class XorTest {

	@Test
	public void binTest01() {
		Xor tester = new Xor();
		System.out.println("Binary Test 01 Started");
		assertEquals(0.0, tester.function(0.0, 0.0), 0.0);
		System.out.println("Expected = " + 0.0);
		System.out.println("Actual = " + tester.function(0.0, 0.0));
		System.out.println("Binary Test 01 Completed\n");
	}
	
	@Test
	public void binTest02() {
		Xor tester = new Xor();
		System.out.println("Binary Test 02 Started");
		assertEquals(1.0, tester.function(0.0, 1.0), 0.0);
		System.out.println("Expected = " + 1.0);
		System.out.println("Actual = " + tester.function(0.0, 1.0));
		System.out.println("Binary Test 02 Completed\n");
	}
	
	@Test
	public void binTest03() {
		Xor tester = new Xor();
		System.out.println("Binary Test 03 Started");
		assertEquals(1.0, tester.function(1.0, 0.0), 0.0);
		System.out.println("Expected = " + 1.0);
		System.out.println("Actual = " + tester.function(1.0, 0.0));
		System.out.println("Binary Test 03 Completed\n");
	}
	
	@Test
	public void binTest04() {
		Xor tester = new Xor();
		System.out.println("Binary Test 04 Started");
		assertEquals(0.0, tester.function(1.0, 1.0), 0.0);
		System.out.println("Expected = " + 0.0);
		System.out.println("Actual = " + tester.function(1.0, 1.0));
		System.out.println("Binary Test 04 Completed\n");
	}
	
	
	@Test
	public void test01() {
		Xor tester = new Xor();
		System.out.println("Test Case 01 Started - Decimal");
		assertEquals(1983.0, tester.function(1110.0, 1001.0), 0.0);
		System.out.println("Expected = " + 1983.0);
		System.out.println("Actual = " + tester.function(1110.0, 1001.0));
		System.out.println("Test Case 01 Completed - Decimal \n");
	}
	
	@Test
	public void test02() {
		Xor tester = new Xor();
		System.out.println("Test Case 02 Started - Infinity");
		double inf = Double.POSITIVE_INFINITY;
		try {
			   tester.function(inf, inf); 
			   fail("Exception was suppose to be thrown - Failed");
			} 
		catch (Exception e) {
				System.out.println("Exception was thrown - Passed");
			} 
		System.out.println("Test Case 02 Completed - Infinity\n");
	}

}
