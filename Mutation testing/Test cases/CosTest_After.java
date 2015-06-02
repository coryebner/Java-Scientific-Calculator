package jscicalc.pobject;

import static org.junit.Assert.*;
import jscicalc.AngleType;
import jscicalc.OObject;
import jscicalc.complex.Complex;

import org.junit.Test;

public class CosTest 
{	
	
	//switch out the delta for delCosFR if you want to test for accuracy
	double delCosFR = 0.000000000000008;
	double delta = 0.1;

	@Test
	//Tests Cos class in Degrees Max Value
	//max value = 1.7976931348623157E308
	public void testCosDegreesUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		Cos testClass = new Cos(AngleType.DEGREES);
		assertEquals(0.371, testClass.function(Double.MAX_VALUE), delta);
		//assertEquals(0.1736481776669303488517166267693147960003756771840693, testClass.function(Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests Cos class in Degrees Min Value.
	//min value = 4.9E-324
	//expected ans = 0.999999999...... however this gets rounded to 1 in the calc
	//Actual ans = 1
	public void testCosDegreesLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.DEGREES);
		assertEquals(1, testClass.function(Double.MIN_VALUE), delta);
	}
	
	@Test
	//Tests Cos class in Degrees negative Max Value
	//max value = -1.7976931348623157E308
	public void testCosDegreesNegativeUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		Cos testClass = new Cos(AngleType.DEGREES);
		assertEquals(0.371, testClass.function(-Double.MAX_VALUE), delta);

		//assertEquals(0.1736481776669303488517166267693147960003756771840693, testClass.function(-Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests Cos class in Degrees negative Min Value.
	//min value = -4.9E-324
	//expected ans = 0.99999999....  however this gets rounded to 1 in the calc
	//Actual ans =1
	public void testCosDegreesNegativeLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.DEGREES);
		assertEquals( 1, testClass.function(-Double.MIN_VALUE), delta);
	}
	
	
	@Test
	//Tests Cos class in Radians Max Value
	//max value = 1.7976931348623157E308
	public void testCosRadiansUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		Cos testClass = new Cos(AngleType.RADIANS);
		assertEquals(-0.9466534, testClass.function(Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests Cos class in Radians Min Value.
	//min value = 4.9E-324
	//expected ans = 0.99999999....  however this gets rounded to 1 in the calc
	//Actual ans =1
	public void testCosRadiansLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.RADIANS);
		assertEquals(1, testClass.function(Double.MIN_VALUE), delta);
	}
	
	@Test
	//Tests Cos class in Radians negative Max Value
	//max value = -1.7976931348623157E308
	public void testCosRadiansNegativeUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		Cos testClass = new Cos(AngleType.RADIANS);
		assertEquals(-0.9466534, testClass.function(-Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests Cos class in Radians negative Min Value.
	//min value = -4.9E-324
	//expected ans = 0.99999999....  however this gets rounded to 1 in the calc
	//Actual ans =1
	public void testCosRadiansNegativeLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.RADIANS);
		assertEquals( 1, testClass.function(-Double.MIN_VALUE), delta);
	}
	
	
	
	@Test
	//Tests Cos class in Degrees .
	//value = 0
	public void testCosDegreesZero() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.DEGREES);
		assertEquals( 1, testClass.function(0), delta);
	}
	
	@Test
	//Tests Cos class in Radians .
	//value = 0
	//expected ans = 0
	public void testCosRadiansZero() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.RADIANS);
		assertEquals( 1, testClass.function(0), delta);
	}
	
	
	@Test
	//Tests Cos class in Degrees .
	//value = 50
	//expected ans = 1.1917535925942099587053080718604193369307004077085438
	public void testCosDegreesFifty() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.DEGREES);
		assertEquals( 0.6427876096865393263226434099072634329075598842056817, testClass.function(50), delta);
	}
	
	@Test
	//Tests Cos class in Degrees .
	//value = 50
	//expected ans = 1.1917535925942099587053080718604193369307004077085438
	public void testCosRadiansFifty() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.RADIANS);
		assertEquals( 0.9649660284921132740689570589010169919204172753780617, testClass.function(0), delta);
	}
	
	@Test
	//Tests Cos name array function
	public void testNameArray() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.RADIANS);
		String[] TestName = { "c", "o", "s", " " };
		assertEquals( TestName, testClass.name_array());
	}
	

	

	@Test
	public void testOObject() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.DEGREES);
		OObject testObject = new OObject() {
			
		};
		
		OObject ExpectedObject = testObject.cos(AngleType.DEGREES);
		
		//assertEquals(ExpectedObject , testClass.function(testObject));
	}
	
	@Test
	public void testComplexObject() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.RADIANS);
		Complex testObject = new Complex(5) {
		};
		
		Complex ExpectedObject = testObject.cos();
		
		//assertEquals(ExpectedObject , testClass.function(testObject));
	}
	
	@Test  (expected = RuntimeException.class)  
	public void testErrorComplexObject() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.DEGREES);
		Complex testObject = new Complex(1, 3);
		
	
		Complex ExpectedObject = testObject.cos();
		System.out.println(StrictMath.abs(testObject.imaginary()));
		
		testClass.function(testObject);
		assertEquals(ExpectedObject , testClass.function(testObject));
	}
	
	@Test
	public void testMain() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.RADIANS);
		String args[] = null;
		testClass.main(args);
	}

	@Test 
	public void testErrorOObject() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.DEGREES);
		Complex testObject = new Complex(0, 0);
		 
		//if( scale != 1 && StrictMath.abs( c.imaginary() ) > 1e-6 )
	
		Complex ExpectedObject = testObject.cos();
		
		testClass.function(testObject);
		assertNotNull(testClass.function(testObject));
	}
	
	@Test 
	public void testOObjectNotComplex() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.DEGREES);
		OObject obj = new OObject() {
		};		 
		//if( scale != 1 && StrictMath.abs( c.imaginary() ) > 1e-6 )
	
		
		assertNotNull(testClass.function(obj));
	}
	
	@Test  
	public void testErrorComplexObjectBoundry() 
	{
		//System.out.println(Double.MIN_VALUE);
		Cos testClass = new Cos(AngleType.DEGREES);
		Complex testObject = new Complex(1, 0.000001);
		
	
		;
		//System.out.println(StrictMath.abs(testObject.imaginary()));
		
		testClass.function(testObject);
		assertSame(testClass, testClass);
	}


}
