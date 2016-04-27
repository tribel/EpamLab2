package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareEquationTest {

	@Test
	public void testIsIntegerTwoRoots() {
		SquareEquation equation = new SquareEquation(1. , -5., 6. );
		assertTrue(equation.isIntegerRoots());
		assertEquals(equation.rootsAmount(), 2);
	}
	
	@Test
	public void testIsIntegerZeroRoots() {
		SquareEquation equation = new SquareEquation(2.5, 3.1, 7.8);
		assertFalse(equation.isIntegerRoots());
		assertEquals(equation.rootsAmount(), 0);
	}
	

}
