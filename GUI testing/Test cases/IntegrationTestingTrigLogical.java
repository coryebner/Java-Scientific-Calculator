package jscicalc.pobject;

import static org.junit.Assert.*;
import jscicalc.AngleType;

import org.junit.Test;

public class IntegrationTestingTrigLogical {

	@Test
	public void XorSin90Test() 
	{
		Sin sinObject = new Sin(AngleType.DEGREES);
		Xor xorObject = new Xor();
			
		//Testing normal value given
		assertEquals( 1, xorObject.function(0, sinObject.function(90)), 0);
	}
	
	@Test
	public void AndTan180Test() 
	{
		Tan tanObject = new Tan(AngleType.DEGREES);
		And andObject = new And();
			
		//Testing normal value given
		assertEquals( 0, andObject.function(1, tanObject.function(180)), 0);
	}
	
	@Test
	public void LnCos0Test()
	{
		Cos cosObject = new Cos(AngleType.DEGREES);
		Ln lnObject = new Ln();
			
		//Testing normal value given
		assertEquals( 0, lnObject.function(cosObject.function(0)), 0);
	}
	
	@Test
	public void TenXACosTest()
	{
		TenX tenXObject = new TenX();
		ACos acosObject = new ACos(AngleType.DEGREES);
			
		//Testing normal value given
		assertEquals( 1, tenXObject.function(acosObject.function(1)), 0);
	}
}
