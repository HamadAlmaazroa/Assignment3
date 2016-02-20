package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * CalculatorTest class that uses Junit library to test examine one unit of the code at a time
 * 
 * @author hamad almazroa for CSE 360
 */

public class CalculatorTest {

	
	@Test
	public void testCalculator() {

		//testCalculator test to make sure that the
		//constructor does not return a null
		Calculator test = new Calculator();
		assertNotNull(test);
	}

	@Test
	public void testGetTotal() {
		Calculator test = new Calculator();
		
		// check if the initial value of total is 0
		assertEquals(0,test.getTotal());
		
		// Adding some integers to check if getTotal returns the correct value
		// after adding the value in the parameter	
		test.add(5);
		test.add(9);
		assertEquals(14, test.getTotal());
		
		// subtracting some integers to check if getTotal returns the correct value
		// after subtracting the value in the parameter

		test.subtract(3);
		test.subtract(1);
		assertEquals(10, test.getTotal());
		
		// multipling some integers to check if getTotal returns the correct value
		// after multipling the value in the parameter
		test.multiply(3);
		test.multiply(2);
		assertEquals(60, test.getTotal());
		
		// Dividing some integers to check if getTotal returns the correct value
		// after Dividing the value in the parameter
		test.divide(6);
		test.divide(2);
		assertEquals(5, test.getTotal());

		// Dividing by zero to check if getTotal returns zero
		test.divide(0);
		assertEquals(0, test.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator test = new Calculator();
		
		// Adding some integers to check if they are being added correctly
		// to the total variable	
		test.add(2);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(1);
		test.add(3);
		test.add(9);
		test.add(4);
		test.add(10);
		test.add(20);
		test.add(8);
		assertEquals(72, test.getTotal());
		
		// Adding zero to check if the total variable does not add any integer
		test.add(0);
		assertEquals(72, test.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator test = new Calculator();
		
		// Subtracting some integers from an initial value of total (0)
		// to check if they are being subtracted correctly
		// and the total variable is a negative number		
		test.subtract(3);
		test.subtract(1);
		test.subtract(5);
		test.subtract(6);
		assertEquals(-15, test.getTotal());
		
		// Adding an integer and then subtract an integer from it to make sure
		// the program can subtract from non zero number.
		test.add(22);
		assertEquals(7, test.getTotal());
		
		test.subtract(7);
		assertEquals(0, test.getTotal());	
	}

	@Test
	public void testMultiply() {
		Calculator test = new Calculator();
		
		// multipling some integers to check if they are being multiplied correctly
		// by the total variable
		test.multiply(3);
		test.multiply(2);
		assertEquals(6, test.getTotal());	

		test.multiply(5);
		test.multiply(3);
		assertEquals(90, test.getTotal());	
		
		// Multipling by zero to check if the variable total is zero
		test.multiply(0);
		assertEquals(0, test.getTotal());	
	}

	@Test
	public void testDivide() {
		Calculator test = new Calculator();
		
		// Dividing by zero to check if the variable total is zero
		test.divide(0);
		assertEquals(0, test.getTotal());
		
		// Dividing some integers by 87 to check if they are being Divided correctly
		test.add(87);
		test.divide(2);
		assertEquals(43, test.getTotal());
		
		test.divide(3);
		test.divide(4);
		test.divide(1);
		assertEquals(3, test.getTotal());
		
		// Dividing an integer by zero to check if the varaible total is zero
		test.divide(0);
		assertEquals(0, test.getTotal());	
	}

	@Test
	public void testGetHistory() {
		Calculator test = new Calculator();
		
		// Test getHistory to check if it has an empty string
		assertEquals("", test.getHistory());
	}

}
