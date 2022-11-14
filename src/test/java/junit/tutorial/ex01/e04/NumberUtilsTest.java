package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@Test
	void testIsEven1() {
		int test = 10;
		assertEquals(true, NumberUtils.isEven(test),"IsEven_test1");
	}

	@Test
	void testIsEven2() {
		int test = 7;
		assertEquals(false, NumberUtils.isEven(test),"IsEven_test1");
	}
}
