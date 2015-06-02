package jscicalc.pobject;

import static org.junit.Assert.*;
import jscicalc.AngleType;

import org.junit.Test;

public class TanTest 
{	
	
	//switch out the delta for deltaNFR if you want to test for accuracy
	double deltaNFR = 0.000000000000008;
	double delta = 0.1;

	@Test
	//Tests Tan class in Degrees Max Value
	//max value = 1.7976931348623157E308
	public void testTanDegreesUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		Tan testClass = new Tan(AngleType.DEGREES);
		assertEquals(-5.67128181961770953099441843986396442162537826068975, testClass.function(Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests Tan class in Degrees Min Value.
	//min value = 4.9E-324
	//expected ans = -8.55211E-326 but this is out of double range
	//Actual ans = 0
	public void testTanDegreesLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		Tan testClass = new Tan(AngleType.DEGREES);
		assertEquals(0, testClass.function(Double.MIN_VALUE), delta);
	}
	
	@Test
	//Tests Tan class in Degrees negative Max Value
	//max value = -1.7976931348623157E308
	public void testTanDegreesNegativeUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		Tan testClass = new Tan(AngleType.DEGREES);
		assertEquals(5.67128181961770953099441843986396442162537826068975, testClass.function(-Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests Tan class in Degrees negative Min Value.
	//min value = -4.9E-324
	//expected ans = -8.55211E-326 but this is out of double range
	//Actual ans = 0
	public void testTanDegreesNegativeLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		Tan testClass = new Tan(AngleType.DEGREES);
		assertEquals( 0, testClass.function(-Double.MIN_VALUE), delta);
	}
	
	
	@Test
	//Tests Tan class in Radians Max Value
	//max value = 1.7976931348623157E308
	//expected ans = complex infinity 
	public void testTanRadiansUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		Tan testClass = new Tan(AngleType.RADIANS);
		assertEquals(0, testClass.function(Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests Tan class in Radians Min Value.
	//min value = 4.9E-324
	//expected ans = -8.55211E-326 but this is out of double range
	//Actual ans = 0
	public void testTanRadiansLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		Tan testClass = new Tan(AngleType.RADIANS);
		assertEquals(0, testClass.function(Double.MIN_VALUE), delta);
	}
	
	@Test
	//Tests Tan class in Radians negative Max Value
	//max value = -1.7976931348623157E308
	//expected ans = complex infinity 
	public void testTanRadiansNegativeUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		Tan testClass = new Tan(AngleType.RADIANS);
		assertEquals(0, testClass.function(-Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests Tan class in Radians negative Min Value.
	//min value = -4.9E-324
	//expected ans = -8.55211E-326 but this is out of double range
	//Actual ans = 0
	public void testTanRadiansNegativeLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		Tan testClass = new Tan(AngleType.RADIANS);
		assertEquals( 0, testClass.function(-Double.MIN_VALUE), delta);
	}
	
	
	
	@Test
	//Tests Tan class in Degrees .
	//value = 0
	public void testTanDegreesZero() 
	{
		//System.out.println(Double.MIN_VALUE);
		Tan testClass = new Tan(AngleType.DEGREES);
		assertEquals( 0, testClass.function(0), delta);
	}
	
	@Test
	//Tests Tan class in Radians .
	//value = 0
	public void testTanRadiansZero() 
	{
		//System.out.println(Double.MIN_VALUE);
		Tan testClass = new Tan(AngleType.RADIANS);
		assertEquals( 0, testClass.function(0), delta);
	}
	
	
	@Test
	//Tests Tan class in Degrees .
	//value = 50
	//expected ans = 1.1917535925942099587053080718604193369307004077085438
	public void testTanDegreesFifty() 
	{
		//System.out.println(Double.MIN_VALUE);
		Tan testClass = new Tan(AngleType.DEGREES);
		assertEquals( 1.1917535925942099587053080718604193369307004077085438, testClass.function(50), delta);
	}
	
	@Test
	//Tests Tan class in Degrees .
	//value = 50
	//expected ans = -0.27190061199763074511353308924467036776794607722546

	public void testTanRadiansFifty() 
	{
		//System.out.println(Double.MIN_VALUE);
		Tan testClass = new Tan(AngleType.RADIANS);
		assertEquals( -0.27190061199763074511353308924467036776794607722546, testClass.function(50), delta);
	}
	
	
	
	
	
	
	
	
	


}
