package jscicalc.pobject;

import static org.junit.Assert.*;
import jscicalc.AngleType;

import org.junit.Test;




public class SinTest 
{	
	
	//switch out the delta for deltaNFR if you want to test for accuracy
	double deltaNFR = 0.000000000000008;
	double delta = 0.1;

	@Test
	//Tests Sin class in Degrees Max Value
	//max value = 1.7976931348623157E308
	public void testSinDegreesUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		Sin testClass = new Sin(AngleType.DEGREES);
		assertEquals(-0.98480775301220805936674302458952301367064325171984, testClass.function(Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests Sin class in Degrees Min Value.
	//min value = 4.9E-324
	//expected ans = -8.55211E-326 but this is out of double range
	//Actual ans = 0
	public void testSinDegreesLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		Sin testClass = new Sin(AngleType.DEGREES);
		assertEquals(0, testClass.function(Double.MIN_VALUE), delta);
	}
	
	@Test
	//Tests Sin class in Degrees negative Max Value
	//max value = -1.7976931348623157E308
	public void testSinDegreesNegativeUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		Sin testClass = new Sin(AngleType.DEGREES);
		assertEquals(0.98480775301220805936674302458952301367064325171984, testClass.function(-Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests Sin class in Degrees negative Min Value.
	//min value = -4.9E-324
	//expected ans = -8.55211E-326 but this is out of double range
	//Actual ans = 0
	public void testSinDegreesNegativeLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		Sin testClass = new Sin(AngleType.DEGREES);
		assertEquals( 0, testClass.function(-Double.MIN_VALUE), delta);
	}
	
	
	@Test
	//Tests Sin class in Radians Max Value
	//max value = 1.7976931348623157E308
	public void testSinRadiansUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		Sin testClass = new Sin(AngleType.RADIANS);
		assertEquals(0.322253439190571841215, testClass.function(Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests Sin class in Radians Min Value.
	//min value = 4.9E-324
	//expected ans = -8.55211E-326 but this is out of double range
	//Actual ans = 0
	public void testSinRadiansLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		Sin testClass = new Sin(AngleType.RADIANS);
		assertEquals(0, testClass.function(Double.MIN_VALUE), delta);
	}
	
	@Test
	//Tests Sin class in Radians negative Max Value
	//max value = -1.7976931348623157E308
	public void testSinRadiansNegativeUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		Sin testClass = new Sin(AngleType.RADIANS);
		assertEquals(-0.322253439190571841215, testClass.function(-Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests Sin class in Radians negative Min Value.
	//min value = -4.9E-324
	//expected ans = -8.55211E-326 but this is out of double range
	//Actual ans = 0
	public void testSinRadiansNegativeLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		Sin testClass = new Sin(AngleType.RADIANS);
		assertEquals( 0, testClass.function(-Double.MIN_VALUE), delta);
	}
	
	
	
	@Test
	//Tests Sin class in Degrees .
	//value = 0
	public void testSinDegreesZero() 
	{
		//System.out.println(Double.MIN_VALUE);
		Sin testClass = new Sin(AngleType.DEGREES);
		assertEquals( 0, testClass.function(0), 0);
	}
	
	@Test
	//Tests Sin class in Radians .
	//value = 0

	public void testSinRadiansZero() 
	{
		//System.out.println(Double.MIN_VALUE);
		Sin testClass = new Sin(AngleType.RADIANS);
		assertEquals( 0, testClass.function(0), 0);
	}
	
	@Test
	//Tests Tan class in Degrees .
	//value = 50
	public void testSinDegreesFifty() 
	{
		//System.out.println(Double.MIN_VALUE);
		Sin testClass = new Sin(AngleType.DEGREES);
		assertEquals( 0.7660444431189780352023926505554166739358324570803952, testClass.function(50), 0);
	}
	
	@Test
	//Tests Tan class in Degrees .
	//value = 50
	public void testSinRadiansFifty() 
	{
		//System.out.println(Double.MIN_VALUE);
		Sin testClass = new Sin(AngleType.RADIANS);
		assertEquals( -0.26237485370392878591439364691262254588666596497123, testClass.function(50), 0);
	}
	
	
	
	
	
	
	
	
	


}
