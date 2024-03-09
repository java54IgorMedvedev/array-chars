package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.arrays.ArrayChar;

class ArrayCharTest {

	@Test
	void compareToTest() {
		char[] ar1 = {'1', '2', '3'};
		char[] ar2 = {'9'};
		char[] ar3 = {'1','2','3'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertEquals(8, arrayChar2.compareTo(arrayChar1));
		assertEquals(-8, arrayChar1.compareTo(arrayChar2));
		assertEquals(1, new ArrayChar(new char[] {'a','a'})
				.compareTo(new ArrayChar(new char[] {'a'})));
		assertEquals(0, arrayChar1.compareTo(arrayChar3));
	}
	@Test
	void indexOfTest() {
		char[] ar1 = {'1', '2', '3', '2'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(1, arrayChar1.indexOf('2'));
		assertEquals(-1, arrayChar1.indexOf('9'));
	}
	@Test
	void lastIndexOfTest() {
		char[] ar1 = {'1', '2', '3', '2'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(3, arrayChar1.lastIndexOf('2'));
		assertEquals(-1, arrayChar1.lastIndexOf('9'));
	}
	@Test
	void testCount() {
	    ArrayChar arrayChar = new ArrayChar(new char[] {'a', 'A', 'a', 'b', 'A'});
	    assertEquals(2, arrayChar.count('a')); 
	    assertEquals(2, arrayChar.count('A')); 
	    assertEquals(0, arrayChar.count('z')); 
	}
	@Test
	void testCompareToIgnoreCase() {
	    ArrayChar arrayChar1 = new ArrayChar(new char[] {'a', 'b', 'c'});
	    ArrayChar arrayChar2 = new ArrayChar(new char[] {'A', 'B', 'C'});
	    ArrayChar arrayChar3 = new ArrayChar(new char[] {'a', 'b', 'd'});
	    assertEquals(0, arrayChar1.compareToIgnoreCase(arrayChar2)); 
	    assertTrue(arrayChar1.compareToIgnoreCase(arrayChar3) < 0); 
	}
	@Test
	void testContains() {
	    ArrayChar arrayChar = new ArrayChar(new char[] {'a', 'A', 'a', 'b', 'A'});
	    assertTrue(arrayChar.contains('b')); 
	    assertFalse(arrayChar.contains('z')); 
	}
	@Test
	void testEquals() {
	    ArrayChar arrayChar1 = new ArrayChar(new char[] {'a', 'b', 'c'});
	    ArrayChar arrayChar2 = new ArrayChar(new char[] {'a', 'b', 'c'});
	    ArrayChar arrayChar3 = new ArrayChar(new char[] {'A', 'B', 'C'});
	    assertTrue(arrayChar1.equals(arrayChar2)); 
	    assertFalse(arrayChar1.equals(arrayChar3)); 
	}

	@Test
	void testEqualsIgnoreCase() {
	    ArrayChar arrayChar1 = new ArrayChar(new char[] {'a', 'b', 'c'});
	    ArrayChar arrayChar3 = new ArrayChar(new char[] {'A', 'B', 'C'});
	    assertTrue(arrayChar1.equalsIgnoreCase(arrayChar3)); 
	}
	@Test
	void testCompareToWithDifferentLengths() {
	    ArrayChar arrayChar1 = new ArrayChar(new char[] {'a', 'b'});
	    ArrayChar arrayChar2 = new ArrayChar(new char[] {'a', 'b', 'c'});
	    assertTrue(arrayChar1.compareTo(arrayChar2) < 0, "ArrayChar1 should be considered less than ArrayChar2 due to its shorter length");
	}

}
