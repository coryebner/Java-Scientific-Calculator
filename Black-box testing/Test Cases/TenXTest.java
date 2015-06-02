package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class TenXTest {

	@Test
	public void zeroTest01() {
		TenX tester = new TenX();
		System.out.println("Zero Test 01 Started");
		assertEquals(Math.pow(10.0, 0.0), tester.function(0.0), 0.0);
		System.out.println("Expected = " + Math.pow(10.0, 1.0));
		System.out.println("Actual = " + tester.function(0.0));
		System.out.println("Zero Test 01 Completed\n");
	}
	
	@Test
	public void zeroTest02() {
		TenX tester = new TenX();
		System.out.println("Zero Test 02 Started");
		assertEquals((Math.pow(10.0, 1.0))/10.0, tester.function(0.0), 0.0);
		System.out.println("Expected = " + (Math.pow(10.0, 1.0))/10.0);
		System.out.println("Actual = " + tester.function(0.0));
		System.out.println("Zero Test 02 Completed\n");
	}

	@Test
	public void oneTest() {
		TenX tester = new TenX();
		System.out.println("One Test 01 Started");
		assertEquals(Math.pow(10.0, 1.0), tester.function(1.0), 0.0);
		/**
		try{
			assertEquals(Math.pow(10.0, 1.0), tester.function(1.0), 0.0);
		}
		catch (AssertionError ae) {
			System.out.println("Failed");
		}**/
		System.out.println("Expected = " + Math.pow(10.0, 1.0));
		System.out.println("Actual = " + tester.function(1.0));
		System.out.println("One Test Completed\n");
	}
	
	@Test
	public void negTest01() {
		TenX tester = new TenX();
		System.out.println("Negative Test 01 Started");
		assertEquals(Math.pow(10.0, -1.0), tester.function(-1.0), 0.0);
		System.out.println("Expected = " + Math.pow(10.0, -1.0));
		System.out.println("Actual = " + tester.function(-1.0));
		System.out.println("Negative Test 01 Completed\n");
	}
	
	@Test
	public void negTest02() {
		TenX tester = new TenX();
		System.out.println("Negative Test 02 Started");
		assertEquals(Math.pow(10.0, -1000.0), tester.function(-1000.0), 0.0);
		System.out.println("Expected = " + Math.pow(10.0, -1000.0));
		System.out.println("Actual = " + tester.function(-1000.0));
		System.out.println("Negative Test 02 Completed\n");
	}
	
	@Test
	public void negTest03() {
		TenX tester = new TenX();
		System.out.println("Negative Test 03 Started");
		assertEquals((Math.pow(10.0, 3.0))/10.0, tester.function(2.0), 0.0);
		System.out.println("Expected = " + (Math.pow(10.0, 3.0))/10.0);
		System.out.println("Actual = " + tester.function(2.0));
		System.out.println("Negative Test 03 Completed\n");
	}
	
	@Test
	public void inverseTest1() {
		TenX tester = new TenX();
		System.out.println("Inverse Test 01 Started");
		assertEquals(Math.pow(10.0, Math.log10(10.0)), tester.function(Math.log10(10.0)), 0.0);
		System.out.println("Expected = " + Math.pow(10.0, Math.log10(10.0)));
		System.out.println("Actual = " + tester.function(Math.log10(10.0)));
		System.out.println("Inverse Test 01 Completed\n");
	}
	
	@Test
	public void lrgTest1() {
		TenX tester = new TenX();
		System.out.println("Test Case 01 Started");
		assertEquals(Math.pow(10.0, 1000.0), tester.function(1000.0), 0.0);
		System.out.println("Expected = " + Math.pow(10.0, 1000.0));
		System.out.println("Actual = " + tester.function(1000.0));
		System.out.println("Test Case 01 Completed\n");
	}
	
	@Test
	public void smlTest01() {
		TenX tester = new TenX();
		System.out.println("Test Case 02 Started");
		assertEquals(Math.pow(10.0, 0.0001), tester.function(0.0001), 0.0);
		System.out.println("Expected = " + Math.pow(10.0, 0.0001));
		System.out.println("Actual = " + tester.function(0.0001));
		System.out.println("Test Case 02 Completed\n");
	}
}
