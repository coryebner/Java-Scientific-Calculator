package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class CubeRootTest {

	@Test
	// Large negative Number
	public void test01() {
		jscicalc.pobject.CubeRoot tester = new jscicalc.pobject.CubeRoot();

		assertEquals("Cube Root Test: -8000000", -200, tester.function(-8000000), 0.00001);
			
	}
	
	@Test
	// small negative Number
	public void test02() {
		jscicalc.pobject.CubeRoot tester = new jscicalc.pobject.CubeRoot();

		assertEquals("Cube Root Test: -2", -1.259921, tester.function(-2), 0.00001);
			
	}
	
	@Test
	// zero
	public void test03() {
		jscicalc.pobject.CubeRoot tester = new jscicalc.pobject.CubeRoot();

		assertEquals("Cube Root Test: 0", 0, tester.function(0), 0.00001);
			
	}
	
	@Test
	// small positive Number
	public void test04() {
		jscicalc.pobject.CubeRoot tester = new jscicalc.pobject.CubeRoot();

		assertEquals("Cube Root Test: 5", 1.709976, tester.function(5), 0.00001);
			
	}
	
	@Test
	// Large Positive Number
	public void test05() {
		jscicalc.pobject.CubeRoot tester = new jscicalc.pobject.CubeRoot();

		assertEquals("Cube Root Test: 479001600", (double)782.43029, tester.function(479001600), 0.00001);
			
	}
	
	@Test
	// Positive Decimal
	public void test06() {
		jscicalc.pobject.CubeRoot tester = new jscicalc.pobject.CubeRoot();

		assertEquals("Cube Root Test: 576.78654", 8.324121, tester.function(576.78654), 0.00001);
			
	}
	
	@Test
	// Negative Decimal
	public void test07() {
		jscicalc.pobject.CubeRoot tester = new jscicalc.pobject.CubeRoot();

		assertEquals("Cube Root Test: -576.78654", -8.324121, tester.function(-576.78654), 0.00001);
			
	}

}
