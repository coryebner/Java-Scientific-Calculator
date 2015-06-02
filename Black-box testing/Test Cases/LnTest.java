package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class LnTest {

	@Test
	public void idTest1() {
		Ln tester = new Ln();
		System.out.println("Identity Test 01 Started");
		assertEquals(0.0, tester.function(1.0), 0.0);
		System.out.println("Expected = " + 0.0);
		System.out.println("Actual = " + tester.function(1.0));
		System.out.println("Test 01 Completed\n");
	}
	
	@Test
	public void idTest2() {
		Ln tester = new Ln();
		System.out.println("Identity Test 02 Started");
		assertEquals(Math.log(Math.pow(2.0,2.0)), 2.0 * tester.function(2.0), 0.0);
		System.out.println("Expected = " + Math.log(Math.pow(2.0,2.0)));
		System.out.println("Actual = " + 2.0 * tester.function(2.0));
		System.out.println("Identity Test 02 Completed\n");
	}
	
	@Test
	public void idTest3() {
		Ln tester = new Ln();
		System.out.println("Identity Test 03 Started");
		assertEquals(2.0, tester.function(Math.exp(2.0)), 0.0);
		System.out.println("Expected = " + 2.0);
		System.out.println("Actual = " + tester.function(Math.exp(2.0)));
		System.out.println("Identity Test 03 Completed\n");
	}
	
	@Test
	public void idTest4() {
		Ln tester = new Ln();
		System.out.println("Identity Test 04 Started");
		assertEquals(Math.log(4.0) + Math.log(3.0), tester.function(4.0 * 3.0), 0.0);
		System.out.println("Expected = " + (Math.log(4.0) + Math.log(3.0)));
		System.out.println("Actual = " + tester.function(4.0 * 3.0));
		System.out.println("Identity Test 04 Completed\n");
	}
	
	@Test
	public void specTest1() {
		Ln tester = new Ln();
		System.out.println("Special Case Test 01 Started");
		assertEquals(Math.log(-1), tester.function(-1), 0.0);
		System.out.println("Expected = " + Math.log(-1));
		System.out.println("Actual = " + tester.function(-1));
		System.out.println("Special Case 01 Completed\n");
	}
	
	@Test
	public void specTest2() {
		Ln tester = new Ln();
		double inf = Double.POSITIVE_INFINITY;
		System.out.println("Special Case Test 02 Started");
		assertEquals(Math.log(inf), tester.function(inf), 0.0);
		System.out.println("Expected = " + Math.log(inf));
		System.out.println("Actual = " + tester.function(inf));
		System.out.println("Special Case 02 Completed\n");
	}
	
	@Test
	public void specTest3() {
		Ln tester = new Ln();
		System.out.println("Special Case Test 03 Started");
		assertEquals(Math.log(-0), tester.function(-0), 0.0);
		System.out.println("Expected = " + Math.log(-0));
		System.out.println("Actual = " + tester.function(-0));
		System.out.println("Special Case 03 Completed\n");
	}
	
	@Test
	public void lrgTest1() {
		Ln tester = new Ln();
		System.out.println("Test Case 01 Started");
		assertEquals(Math.log(1000), tester.function(1000), 0.0);
		System.out.println("Expected = " + Math.log(1000));
		System.out.println("Actual = " + tester.function(1000));
		System.out.println("Test Case 01 Completed\n");
	}
	
	@Test
	public void smallTest1() {
		Ln tester = new Ln();
		System.out.println("Test Case 02 Started");
		assertEquals(Math.log(0.0001), tester.function(0.0001), 0.0);
		System.out.println("Expected = " + Math.log(0.0001));
		System.out.println("Actual = " + tester.function(0.0001));
		System.out.println("Test Case 02 Completed\n");
	}
	
	@Test
	public void zeroTest1() {
		Ln tester = new Ln();
		System.out.println("Test Case 03 Started");
		assertEquals(Math.log(0), tester.function(0), 0.0);
		System.out.println("Expected = " + Math.log(0));
		System.out.println("Actual = " + tester.function(0));
		System.out.println("Test Case 03 Completed\n");
	}
}
