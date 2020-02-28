import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestClass {

	@Test
	void test0() {
		
		int expected = 4 ;
		int actual = 0 ;
		actual = Calculator.add(2,2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test1() {
		
		int expected = 8 ;
		int actual = 0 ;
		actual = Calculator.add(4,4);
		
		assertEquals(expected, actual);
	}
	@Test
	void test2() {
		
		int expected = 12 ;
		int actual = 0 ;
		actual = Calculator.add(10,2);
		
		assertEquals(expected, actual);
	}
	@Test
	void test3() {
		
		int expected = 12 ;
		int actual = 0 ;
		actual = Calculator.add(8,4);
		
		assertEquals(expected, actual);
	}
	@Test
	void test4() {
		
		int expected = 400 ;
		int actual = 0 ;
		actual = Calculator.add(250,150);
		
		assertEquals(expected, actual);
	}
	@Test
	void test5() {
		
		int expected = 4000 ;
		int actual = 0 ;
		actual = Calculator.add(2500,1500);
		
		assertEquals(expected, actual);
	}


}
