package jscicalc.pobject;

import static org.junit.Assert.*;
import jscicalc.AngleType;

import org.junit.Test;

public class ACosTest 
{	
	
	//switch out the delta for delACosFR if you want to test for accuracy
	double delACosFR = 0.000000000000008;
	double delta = 0.1;

	@Test
	//Tests ACos class in Degrees Max Value
	//max value = 1.7976931348623157E308
	public void testACosDegreesUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		assertEquals(Double.NaN, testClass.function(Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests ACos class in Degrees Min Value.
	//min value = 4.9E-324
	public void testACosDegreesLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		assertEquals(90, testClass.function(Double.MIN_VALUE), delta);
	}
	
	@Test
	//Tests ACos class in Degrees negative Max Value
	//max value = -1.7976931348623157E308
	public void testACosDegreesNegativeUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		assertEquals(Double.NaN, testClass.function(-Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests ACos class in Degrees negative Min Value.
	//min value = -4.9E-324
	public void testACosDegreesNegativeLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		assertEquals( 90, testClass.function(-Double.MIN_VALUE), delta);
	}
	
	
	@Test
	//Tests ACos class in Radians Max Value
	//max value = 1.7976931348623157E308
	public void testACosRadiansUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		ACos testClass = new ACos(AngleType.RADIANS);
		System.out.println(testClass.function(Double.MAX_VALUE));
		assertEquals(Double.NaN, testClass.function(Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests ACos class in Radians Min Value.
	//min value = 4.9E-324
	//expected ans = 0.99999999....  however this gets rounded to 1 in the calc
	//Actual ans =1
	public void testACosRadiansLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.RADIANS);
		assertEquals(Double.NaN, testClass.function(Double.MIN_VALUE), delta);
	}
	
	@Test
	//Tests ACos class in Radians negative Max Value
	//max value = -1.7976931348623157E308
	public void testACosRadiansNegativeUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		ACos testClass = new ACos(AngleType.RADIANS);
		assertEquals(Double.NaN, testClass.function(-Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests ACos class in Radians negative Min Value.
	//min value = -4.9E-324
	//expected ans = 0.99999999....  however this gets rounded to 1 in the calc
	//Actual ans =1
	public void testACosRadiansNegativeLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.RADIANS);
		assertEquals(0 , testClass.function(-Double.MIN_VALUE), delta);
	}
	
	
	
	@Test
	//Tests ACos class in Degrees .
	//value = 0
	public void testACosDegreesZero() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		assertEquals( 90 , testClass.function(0), delta);
	}
	
	@Test
	//Tests ACos class in Radians .
	//value = 0
	public void testACosRadiansZero() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.RADIANS);
		assertEquals( 1.5707963267948966192313216916397514420985846996875529, testClass.function(0), delta);
	}
	
	
	@Test
	//Tests ACos class in Degrees .
	//value = 50
	public void testACosDegreesFifty() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		assertEquals( Double.NaN, testClass.function(50), delta);
	}
	
	@Test
	//Tests ACos class in Degrees .
	//value = 50
	//expected ans = 1.1917535925942099587053080718604193369307004077085438
	public void testACosRadiansFifty() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.RADIANS);
		assertEquals( Double.NaN, testClass.function(0), delta);
	}
	
	
	
	
	
	
	
	
	


}
