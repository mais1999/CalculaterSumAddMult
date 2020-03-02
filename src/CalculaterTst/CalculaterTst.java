package CalculaterTst;

import static org.junit.Assert.*;


import org.junit.Test;


import Calculater.Calculater;

public class CalculaterTst {

	@Test(timeout=100)
	public void testMult_TwoPosInt_PosInt() {
		
		Calculater o=new Calculater();
		int res=o.mult(5,2);
		assertTrue(res==10);
	}
	@Test(timeout=100)
	public void testMult_TwoNegInt_PostInt() {
		
		Calculater o=new Calculater();
		int res=o.mult(-5,-2);
		assertTrue(res==10);
	}
	
	@Test(timeout=100)
	public void testMult_OnePosIntWith0_ZeroInt() {
		
		Calculater o=new Calculater();
		int res=o.mult(5,0);
		assertTrue(res==0);
	}
	@Test(timeout=100)
	public void testMult_OneNegIntWith0_ZeroInt() {
		
		Calculater o=new Calculater();
		int res=o.mult(-5,0);
		assertTrue(res==0);
	}
	@Test(timeout=100) 
	public void testMult_FirstPosIntSecondNeg_NegInt() {
		
		Calculater o=new Calculater();
		int res=o.mult(5,-2);
		
		assertTrue(res==-10);
	}
	@Test(timeout=100)
	public void testMult_FirstNegIntSecondNeg_NegInt() {
		
		Calculater o=new Calculater();
		int res=o.mult(-5,2);
		assertTrue(res==-10);
	}
	
	@Test(timeout=100)
	public void testAdd_TwoPosInt_PosInt() {
		
		Calculater o=new Calculater();
		int res=o.add(5,8);
		assertTrue(res==13);
	}
	@Test(timeout=100)
	public void testAdd_TwoNegInt_NegInt() {
		
		Calculater o=new Calculater();
		int res=o.add(-5,-8);
		assertTrue(res==-13);
	}
	
	@Test(timeout=100)
	public void testAdd_OnePosIntWith0_PosInt() {
		
		Calculater o=new Calculater();
		int res=o.add(5,0);
		assertTrue(res==5);
	}
	@Test(timeout=100)
	public void testAdd_OneNegIntWith0_NegInt() {
		
		Calculater o=new Calculater();
		int res=o.add(-5,0);
		assertTrue(res==-5);
	}
	@Test(timeout=100) 
	public void testAdd_FirstPosIntSecondNeg_GreaterInt() {
		
		Calculater o=new Calculater();
		int res=o.add(5,-8);
		
		assertTrue(res==-3);
	}
	@Test(timeout=100)
	public void testAdd_FirstNegIntSecondNeg_GreaterInt() {
		
		Calculater o=new Calculater();
		int res=o.add(-5,8);
		assertTrue(res==3);
	}
	
	@Test(timeout=100)
	public void testSub_FirstPosGreaterSecondPosLess_PostInt() {
		
		Calculater o=new Calculater();
		int res=o.sub(8,5);
		assertTrue(res==3);
	}
	@Test(timeout=100)
	public void testSub_FirstLessIntSecondGreater_NegInt() {
		
		Calculater o=new Calculater();
		int res=o.sub(5,8);
		assertTrue(res==-3);
	}
	@Test(timeout=100)
	public void testSub_FirstNegIntSecondPos_NegInt() {
		
		Calculater o=new Calculater();
		int res=o.sub(-5,8);
		assertTrue(res==-13);
	}
	@Test(timeout=100)
	public void testSub_FirstPosIntSecondNeg_PostInt() {
		
		Calculater o=new Calculater();
		int res=o.sub(5,-8);
		assertTrue(res==13);
	}
	
	
}
