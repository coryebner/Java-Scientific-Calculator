package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhiteBoxCubeTest {

	@Test
	public void testFunctionDouble() {
		Cube test = new Cube();
		
		//Checking a huge negative number
		assertEquals("Testing -200",(double)-8000000,(double)test.function(-200),(double)0);
		
		//Checking a low negative number
		assertEquals("Testing -1",(double)-1,(double)test.function(-1),(double)0);
		
		//Checking 0
		assertEquals("Testing 0",(double)0,(double)test.function(0),(double)0);
		
		//Checking a low positive number
		assertEquals("Testing 2",(double)8,(double)test.function(2),(double)0);
		
		//Checking a huge positive number
		assertEquals("Testing 195",(double)7414875,(double)test.function(195),(double)0);
		
		//Testing a positive decimal value
		assertEquals("Testing 10.3",(double)1092.727,(double)test.function(10.3),(double)0.00001);
		
		//Testing a negative decimal value
		assertEquals("Testing -10.3",(double)-1092.727,(double)test.function(-10.3),(double)0.00001);
	}

}
