package jscicalc.pobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhiteBoxSquareTest {

	@Test
	public void testFunctionDouble() {
		Square test = new Square();
		
		//Large negative value
		assertEquals("Testing -356",(double)126736,test.function(-356),(double)0.000001);
		
		//Small negative value
		assertEquals("Testing -4",(double)16,test.function(-4),(double)0.000001);
		
		//Zero
		assertEquals("Testing 0",(double)0,test.function(0),(double)0.000001);
		
		//Small positive value
		assertEquals("Testing 3",(double)9,test.function(3),(double)0.000001);
		
		//Large positive value
		assertEquals("Testing 654",(double)427716,test.function(654),(double)0.000001);
		
		//Positive decimal value
		assertEquals("Testing 1.4",(double)1.96,test.function(1.4),(double)0.000001);
				
		//Negative decimal value
		assertEquals("Testing -2.6",(double)6.76,test.function(-2.6),(double)0.000001);
	}

}
